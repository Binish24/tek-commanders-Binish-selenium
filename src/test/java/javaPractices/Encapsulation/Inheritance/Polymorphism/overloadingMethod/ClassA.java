package javaPractices.Encapsulation.Inheritance.Polymorphism.overloadingMethod;

public class ClassA {

    public int sum (int a, int b) {

        return a + b;
    }

    public double sum (double a, int b) {

        return a + b;
    }

    public int sum (int a, int b, int c, int d) {

        return a + b + c + d;

    }
}
