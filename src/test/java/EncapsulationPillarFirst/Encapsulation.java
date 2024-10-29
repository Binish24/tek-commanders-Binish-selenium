package EncapsulationPillarFirst;

public class Encapsulation {

   ///Fields

//    String firstName;
//    String lastName;
//    String occupation;
//    int age;


    String duty;
    String dateOfBirth;
    int phoneNumber;

    //Methods to print the values of variable


//    public void printInfo(){
//
//        System.out.println("First Name: " + firstName);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Occupation: " + occupation);
//        System.out.println("Age: " + age);

//public Encapsulation(){
//
//    this.duty= " ";
//    this.dateOfBirth= " ";
//    this.phoneNumber= 0;

    public Encapsulation(String duty, String dateOfBirth, int phoneNumber) {

       this.duty= duty;
       this.dateOfBirth=dateOfBirth;
       this.phoneNumber=phoneNumber;


    }

    public void printMessage(){

        System.out.println("Duty : " + duty);
        System.out.println("Date of Birth " + dateOfBirth);
        System.out.println("Phone Number: " + phoneNumber);

    }




}
