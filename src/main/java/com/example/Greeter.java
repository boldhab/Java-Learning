package com.example;

public class Greeter {
    public String greet(String name) {
        return "Hello, " + formatName(name) + "!";
    }

    private String formatName(String name) {
        if (name == null) {
            return "Friend";
        }

        String trimmed = name.trim();
        if (trimmed.isEmpty()) {
            return "Friend";
        }

        return trimmed;
    }
}
