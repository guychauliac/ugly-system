package com.zenika.uglysystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={AdminController.class})
@TestPropertySource("/application.properties")
public class AdminControllerTest {

    @Autowired
    private AdminController adminController;
    
    @Test
    public void contextLoads() {
        assert(adminController.get() != null && adminController.get().equals("SUCCESS"));
    }
    //Simone: This test is working well
}

