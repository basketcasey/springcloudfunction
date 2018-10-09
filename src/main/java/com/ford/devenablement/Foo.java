package com.ford.devenablement;

public class Foo {
    private String value;

    Foo() {
    }

    public String lowercase() {
        return value.toLowerCase();
    }

    public Foo(String value) {
        this.value = value;
    }

    public String reverse() {
        StringBuilder sb = new StringBuilder(value).reverse();
        return sb.toString();
    }
    public String uppercase() {
        return value.toUpperCase();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
