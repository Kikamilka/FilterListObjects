package com.epam.javatraining.filterlistobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppPredicate {

    public static void main(String[] args) {
        
        List<Integer> numberObjects = Arrays.asList(1, 4, -3, 245, 0, -12);
        Predicate notPositive = new Predicate<Integer>() {

            @Override
            public boolean apply(Integer expression) {
                return expression <= 0;
            }
        };
        List<Integer> objectsNotPositive = FilterListObjects.filter(numberObjects, notPositive); 
        System.out.println(objectsNotPositive);
        
        List<String> stringObjects = new ArrayList<>();
        stringObjects.add("Apple");
        stringObjects.add("Banana");
        stringObjects.add("Carrot");
        stringObjects.add("arbuz!");
        
        Predicate beginingSymbolA = new Predicate<String>() {

            @Override
            public boolean apply(String expression) {
                return (expression.startsWith("a") || expression.startsWith("A"));
            }
        };
        List<String> objectsBeginSymbolA = FilterListObjects.filter(stringObjects, beginingSymbolA); 
        System.out.println(objectsBeginSymbolA);

    }

}
