package javaPractices.Encapsulation.Inheritance.MultiLevelInheritance;

public class multiLevelInheritance extends child {

    String phoneNumber;

    public multiLevelInheritance (

            String firstName,
            String lastName,
            int age,
            String address,
            String phoneNumber
    ) {
        super ( firstName,lastName,age,address);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }
}
