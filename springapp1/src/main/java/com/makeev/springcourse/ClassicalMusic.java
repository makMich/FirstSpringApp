package com.makeev.springcourse;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("Initialization Classic");
    }

    public void doMyDestroy() {
        System.out.println("Destruction Classic");
    }
}
