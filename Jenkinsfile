pipeline {
    agent any
    options {
        buildDiscarder(logRotator(daysToKeepStr: '1'))
        disableConcurrentBuilds()
    }
    stages {
        stage('Build artifact') {
            agent {
                docker {
                    reuseNode true
                    image 'maven:3.5.3-jdk-8-slim'
                }
            }
            steps {
                sh '''
                mvn  clean install
                '''
            }
        }
        stage('Sonarqube') {
            environment {
                scannerHome = tool 'sonar3.3'
            }
            steps {
                withSonarQubeEnv('sonarSummit') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
                sleep 20
                timeout(time: 10, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }

        stage('Deploy') {
            environment {
                SSH_KEY = credentials('SSH_KEY')
            }
            agent {
                docker {
                    reuseNode true
                    image 'williamyeh/ansible:ubuntu14.04'
                    args '-u root'
                }
            }
            steps {
                sh '''
                cd deploy
                cp $SSH_KEY ./labs-age-devsecops-slave.pem
                chmod 400 ./labs-age-devsecops-slave.pem
                ansible-playbook playbook.yml
                '''
            }
        }
    }

    post {
        always {
            deleteDir() /* clean up our workspace */
            cleanWs()
        }
    }
}