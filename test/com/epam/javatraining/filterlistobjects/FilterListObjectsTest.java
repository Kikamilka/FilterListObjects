package com.epam.javatraining.filterlistobjects;

import static com.epam.javatraining.filterlistobjects.FilterListObjects.filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilterListObjectsTest {
    
    public FilterListObjectsTest() {
    }

    @Test
    public void testFilter() {
        System.out.println("filter");
        List<Integer> target = Arrays.asList(1, 2, 3, 4, 5);
        Predicate predicate = new EvenNumber();
        List expResult = Arrays.asList(2, 4);
        List result = FilterListObjects.filter(target, predicate);
        assertEquals(expResult, result);
        
        List<Number> numberList = new ArrayList<>();
        numberList.add(20);
        numberList.add(12.2);
        numberList.add((float) 1.2);
        expResult = Arrays.asList(20, 12.2);
        Predicate comparePredicate = new GreaterThanOrEqualNumber(3);
        List resultNumberList = filter(numberList, comparePredicate);
        assertEquals(expResult, resultNumberList);
        
        List resultIntegerList = filter(target, comparePredicate);
        expResult = Arrays.asList(3, 4, 5);
        assertEquals(expResult, resultIntegerList);
    }
    
}
