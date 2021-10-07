package uk.method.overriding;

public class TestClass {

    public static void main(String args[]) {
        Parent parent = new Child(10,20,30                                                                                                         );
        Child child = (Child) parent;

        System.out.println(parent.add());
        System.out.println(parent.multiplication());
        System.out.println(parent);
    }
}
