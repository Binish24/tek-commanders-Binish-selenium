package EncapsulationPillarFirst;

public class EncapsulationPractice {

   private int numberOne;
   private int numberTwo;
   private String name;

    public EncapsulationPractice(int numberTwo){
        numberOne = 11;
       this.numberTwo = numberTwo;
    }

    //Getter And Setter

    public int getNumberOne(){
        return numberOne;
    }

    public void setNumberOne(int numberOne){
        this.numberOne = numberOne;
    }


    public void printMethod(){
        System.out.println("Print!");
    }
}
