package com.zenika.uglysystem;

import java.io.File;

import org.junit.Test;

public class UglySystemApplicationTest {
    
    @Test
    public void main() {
        System.setProperty( "HOME", new File( "" ).getAbsolutePath() );
        new UglySystemApplication().main( new String[] {} );
    }
}
