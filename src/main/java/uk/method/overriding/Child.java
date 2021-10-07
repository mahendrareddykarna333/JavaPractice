package uk.method.overriding;

//3 values
public class Child extends Parent{

    private int c;
    public Child(int a1, int b1, int c) {
        super(a1,b1);
        this.c = c;
    }

    @Override
    public final int add() {
        return c+ super.add();  // a+b+c;
    }

    @Override
    public final int multiplication() {
        return c * super.multiplication();
    }

    @Override
    public String toString() {
        return "Child{" +
                "c=" + c +
                "} " + super.toString();
    }
}
