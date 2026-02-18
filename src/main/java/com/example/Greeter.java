package com.example;

public class Greeter {
    public String greet(String name) {
        return "Hello, " + formatName(name) + "!";
    }

    private String formatName(String name) {
        return name.trim();
    }
}
