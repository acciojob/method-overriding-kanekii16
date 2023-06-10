package com.driver;

public class Main {

    public static void main(String[] args) {

        B person = new B();

        person.meth();

    }
}

/*
* When there was no method in child class the method war being called from parent class A itself.
* but when the method was being written in child class too it just overridden the class A meth.
* */