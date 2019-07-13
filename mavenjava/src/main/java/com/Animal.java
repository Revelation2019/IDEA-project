package com;

public abstract class Animal {

    public final int WELCOME_STATEMENT_TAG=0;

    public abstract void eat();

    public void sayName(String name) {
        System.out.println("my name is " + name);
    }
}
