package com.zenika.uglysystem.game.persistence;
import com.zenika.uglysystem.persistence.MyEntity;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyEntityTest {

    @Test
    public void createEntity() {
        MyEntity entity = new MyEntity();
        entity.setId(1l);
        entity.setName("john");
        entity.setAttribute("dr.");
        
        assertEquals(1l, entity.getId());
        assertEquals("john", entity.getName());
        assertEquals("dr.", entity.getAttribute());
    }
    
}
