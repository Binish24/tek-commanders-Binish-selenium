package EncapsulationPillarFirst;

public class DriverClassOfEncapsulationSecondExample {

    public static void main(String[] args) {


EncapsulationSecondExample objOne = new EncapsulationSecondExample(
        "Ahmad",
        "AziziBank",
        132312);
EncapsulationSecondExample objTwo = new EncapsulationSecondExample(
        "Aziz",
        "AziziBank",
        12312231
);
EncapsulationSecondExample getObjThree = new EncapsulationSecondExample(
        "Tariq",
        "Azizi Bank",
        2534534
);

objOne.printMessage();
objTwo.printMessage();
getObjThree.printMessage();

}

}
