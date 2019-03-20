package com.zenika.uglysystem.game.persistence;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.zenika.uglysystem.persistence.MyEntity;

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
