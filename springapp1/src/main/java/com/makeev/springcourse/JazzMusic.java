package com.makeev.springcourse;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Strange fruit";
    }

    public void doMyInit() {
        System.out.println("Initialization Jazz");
    }

    public void doMyDestroy() {
        System.out.println("Destruction Jazz");
    }
}
