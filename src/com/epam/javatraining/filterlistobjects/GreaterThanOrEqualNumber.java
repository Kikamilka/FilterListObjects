package com.epam.javatraining.filterlistobjects;

class GreaterThanOrEqualNumber implements Predicate<Number> {

    private final Number maxNumber;
    
    public GreaterThanOrEqualNumber(Number maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public boolean apply(Number expression) {
        return expression.intValue() >= maxNumber.intValue();
    }
    
}
