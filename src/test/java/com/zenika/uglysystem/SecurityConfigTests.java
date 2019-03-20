package com.zenika.uglysystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={AdminController.class})
@TestPropertySource("/application.properties")
public class SecurityConfigTests extends AbstractSecurityWebApplicationInitializer {

    //@Autowired
    //private SecurityConfig securityConfig;
    
    //@Test
    //public void contextLoads() {
    //    assert(securityConfig.userDetailsService() != null);
    //}

}

