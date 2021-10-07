package uk.method.overriding;

//Deals with 2 values
public class Parent {

    private int a;
    private int b;

    public Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a+b;
    }

    public int add(int c) {
        return a+b+c;
    }

    public int multiplication() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
