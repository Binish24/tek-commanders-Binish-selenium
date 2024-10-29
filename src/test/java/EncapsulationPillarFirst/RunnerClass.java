package EncapsulationPillarFirst;

public class RunnerClass {

    public static void main(String[] args) {
        ClassesAnd0bjects obj = new ClassesAnd0bjects(11,12);
       String b = obj.aaa();
       int sum = obj.sum();
        System.out.println(obj.sum());
        System.out.println(sum);

        ClassesAnd0bjects obj2 = new ClassesAnd0bjects();

        obj.sumPrint(12,12);

       int result = obj.sumRetun(14,14);
        System.out.println(result);


        System.out.println("**************************************************************************************");


        EncapsulationPractice obj3 = new EncapsulationPractice(55);

        System.out.println(obj3.getNumberOne());
        obj3.setNumberOne(13);
    }
}
