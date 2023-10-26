package com.microservices.limitsservice.bean;

public class Limits {
    private Integer minimum;
    private Integer maximum;

    public Limits() {
        super();
    }
    public Limits(Integer minimum, Integer maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }
}
