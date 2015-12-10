package com.epam.javatraining.filterlistobjects;

import java.util.ArrayList;
import java.util.List;

public class FilterListObjects<T> {

    public static <T> List<T> filter(List<? extends T> target, Predicate<? super T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : target) {
            if (predicate.apply(element)) {
                result.add(element);
            }
        }
        return result;
    }
    
}
