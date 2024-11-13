package javaPractices.Encapsulation.Inheritance.Polymorphism.overloadingMethod;

import javaPractices.Encapsulation.Inheritance.Polymorphism.ClassA;

public class RunnerOverloadingClass {
    public static void main(String[] args) {

        ClassA obj = new ClassA();
        ClassA objOne = new ClassA();
        ClassA objTwo = new ClassA();

        obj.sum(10,29);
        objOne.sum(14.100,12);
        objTwo.sum(123,12312,5345,3432);

        System.out.println(obj.sum(10,29));
        System.out.println(objOne.sum(14.100,12));
        System.out.println(objTwo.sum(123,12312,5345,3432));
    }
}
