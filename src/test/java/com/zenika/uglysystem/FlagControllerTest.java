package com.zenika.uglysystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={FlagController.class})
@TestPropertySource("/application.properties")
public class FlagControllerTest {

    @Autowired
    private FlagController flagController;
    
    @Test
    public void testFlagController() {
        assert(flagController.getFlags() != null);
    }
    //Simone: This test is working well
}

