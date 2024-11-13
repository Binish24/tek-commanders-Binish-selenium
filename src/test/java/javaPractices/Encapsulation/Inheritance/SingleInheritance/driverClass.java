package javaPractices.Encapsulation.Inheritance.SingleInheritance;


import javaPractices.Encapsulation.Inheritance.MultiLevelInheritance.child;
import javaPractices.Encapsulation.Inheritance.MultiLevelInheritance.parent;

public class driverClass {
    public static void main(String[] args) {

        parent employeeOne = new parent(
                "Alex",
                "Sam",
                25
        );

        child childOne = new child(
                "Sam",
                "Tony",
                25,
                "Alameda!"
        );

        employeeOne.printInfo();
        childOne.printChild();
    }
}
