package EncapsulationPillarFirst;

public class EncapsulationExamFour {

    private double balance;
    private String accountHolder;
    private String provinceName;


    public EncapsulationExamFour(double balance, String accountHolder, String provinceName) {

        this.balance = balance;
        this.accountHolder = accountHolder;
        this.provinceName = provinceName;


    }


    public double getBalance(){
        return balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public String getProvinceName(){
        return provinceName;
    }

}
