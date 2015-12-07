package com.epam.javatraining.filterlistobjects;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreaterThanOrEqualNumberTest {
    
    public GreaterThanOrEqualNumberTest() {
    }

    @Test
    public void testApply() {
        System.out.println("apply");
        GreaterThanOrEqualNumber instance = new GreaterThanOrEqualNumber(100);
        boolean result = instance.apply(10);
        assertEquals(false, result);
        
        instance = new GreaterThanOrEqualNumber(10);
        result = instance.apply(20);
        assertEquals(true, result);
    }
    
}
