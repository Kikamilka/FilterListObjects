package com.epam.javatraining.filterlistobjects;

public class EvenNumber implements Predicate<Integer> {

    @Override
    public boolean apply(Integer expression) {
        return expression % 2 == 0;
    }

}
