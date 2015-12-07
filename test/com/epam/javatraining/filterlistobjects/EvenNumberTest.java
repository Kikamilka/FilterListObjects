package com.epam.javatraining.filterlistobjects;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenNumberTest {
    
    public EvenNumberTest() {
    }

    @Test
    public void testApply() {
        System.out.println("apply");
        EvenNumber instance = new EvenNumber();
        
        boolean result = instance.apply(10);
        assertEquals(true, result);
        
        result = instance.apply(91);
        assertEquals(false, result);
    }
    
}
