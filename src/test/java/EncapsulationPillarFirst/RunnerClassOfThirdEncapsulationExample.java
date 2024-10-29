package EncapsulationPillarFirst;

public class RunnerClassOfThirdEncapsulationExample {

    public static void main (String[] args) {


        EncapsulationThirdExample inputOne = new EncapsulationThirdExample();
        EncapsulationThirdExample inputTwo = new EncapsulationThirdExample();
        EncapsulationThirdExample inputThird = new EncapsulationThirdExample();


        inputOne.firstName = "Ahmad";
        inputOne.lastName = "Najat";
        inputOne.nationality= "Afghan";
        inputOne.age= 35;

        inputTwo.firstName = "Gul Ahmad";
        inputTwo.lastName = "Kabir";
        inputTwo.nationality= "Afghan";
        inputTwo.age=27;

        inputThird.firstName = "Mohammad";
        inputThird.lastName = "Nadim";
        inputThird.nationality= "Afghan";
        inputThird.age= 45;

        inputOne.printInfo();
        inputTwo.printInfo();
        inputThird.printInfo();







    }





}
