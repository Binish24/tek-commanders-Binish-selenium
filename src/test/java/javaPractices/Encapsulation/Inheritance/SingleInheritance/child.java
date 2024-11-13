package javaPractices.Encapsulation.Inheritance.SingleInheritance;

import javaPractices.Encapsulation.Inheritance.MultiLevelInheritance.parent;

public class child extends parent {

    private String address;

    public child(
            String firstName,
            String lastName,
            int age,
            String address
    ) {
        super(firstName, lastName, age);
        this.address= address;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address=address;
    }

    public void printChild() {
        super.printInfo();
        System.out.println("Address: " + getAddress());

    }

}
