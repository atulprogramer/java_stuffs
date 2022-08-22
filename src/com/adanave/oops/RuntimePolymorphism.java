package com.adanave.oops;


public class RuntimePolymorphism {

    // dynamic method dispatch
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        A d;

        d = a;
        a.callme();

        d = b;
        d.callme();

        d = c;
        d.callme();

    }

}


class A {

    void callme() {

        System.out.println("Inside A's callme method");
    }
}


class B extends A {

    void callme() {

        System.out.println("Inside B's callme method");
    }

}


class C extends B {

    void callme() {

        System.out.println("Inside C's callme method");
    }

}