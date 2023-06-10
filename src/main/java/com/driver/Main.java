package com.driver;

public class Main {

    public static class A {

        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {

        B obj = new B();
        obj.meth();

        B obj1 = new B();
        obj1.meth();

    }
}

/*
* When there was no method in child class the method war being called from parent class A itself.
* but when the method was being written in child class too it just overridden the class A meth.
* */