package EncapsulationPillarFirst;

public class EncapsulationSecondExample {


    //Fields

    String accountHolder;
    String nameOfTheBank;
    int accountNumber;


    //Constructor

    public EncapsulationSecondExample(String accountHolder, String nameOfTheBank, int accountNumber){

        this.accountHolder= accountHolder;
        this.nameOfTheBank=nameOfTheBank;
        this.accountNumber=accountNumber;


    }

    public void printMessage (){

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Name of the Bank: " + nameOfTheBank);
        System.out.println("Account Number: " + accountNumber);

    }

}