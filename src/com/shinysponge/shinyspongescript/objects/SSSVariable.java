package com.shinysponge.shinyspongescript.objects;

public class SSSVariable<T> {

    private String name;
    private T value;

    public SSSVariable(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
