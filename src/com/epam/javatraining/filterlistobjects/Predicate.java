package com.epam.javatraining.filterlistobjects;

public interface Predicate<T> {
    
    boolean apply(T expression);
    
}