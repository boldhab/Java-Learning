package com.example;

public class Main {
    public static void main(String[] args) {
        AppInfo appInfo = new AppInfo();
        Greeter greeter = new Greeter();
        Calculator calculator = new Calculator();
        Person person = new Person("Java", "Learner");

        System.out.println(appInfo.name() + " v" + appInfo.version());
        System.out.println(greeter.greet(person.fullName()));
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("8 - 5 = " + calculator.subtract(8, 5));
        System.out.println("4 * 6 = " + calculator.multiply(4, 6));
        System.out.println("12 / 3 = " + calculator.divide(12, 3));
    }
}
