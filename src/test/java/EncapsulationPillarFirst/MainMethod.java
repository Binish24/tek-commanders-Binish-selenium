package EncapsulationPillarFirst;

public class MainMethod {


    public static void main(String[] args) {


//        Encapsulation employeeOne = new Encapsulation();
//        Encapsulation employeeTwo = new Encapsulation();
//        Encapsulation employeeThree = new Encapsulation();
//
//        employeeOne.firstName = "Bob";
//        employeeTwo.lastName ="Joe";
//        employeeOne.occupation= "Journalist";
//        employeeOne.age= 45;
//
//        employeeTwo.firstName ="Steve";
//        employeeTwo.lastName ="Jobs";
//        employeeTwo.occupation="Teacher";
//        employeeTwo.age=33;
//
//        employeeThree.firstName="Kamal";
//        employeeThree.lastName="Turk";
//        employeeThree.occupation="Mechanic";
//        employeeThree.age=35;
//
//        employeeOne.printInfo();
//        employeeTwo.printInfo();
//        employeeThree.printInfo();

        Encapsulation obj1 = new Encapsulation("Teacher","12.12.2024",123213);
        Encapsulation obj2= new Encapsulation("Driver","11.11.20224",4234234);
        Encapsulation obj3 = new Encapsulation(null,"10.10.2024",423423234);

        obj1.duty="Teacher";
        obj1.dateOfBirth="12.12.2024";
        obj1.phoneNumber= 51022582;

        obj2.duty="Driver";
        obj2.dateOfBirth="11.11.2011";
        obj2.phoneNumber=51012332;


        obj3.dateOfBirth="10.10.2024";
        obj3.phoneNumber=51011234;

        obj1.printMessage();
        obj2.printMessage();
        obj3.printMessage();



    }




}
