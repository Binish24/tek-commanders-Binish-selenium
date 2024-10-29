package EncapsulationPillarFirst;

public class ClassesAnd0bjects {

    int numberOne;
    int numberTwo;

    public ClassesAnd0bjects(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        print();
    }
    public ClassesAnd0bjects(){
    }

   /* public
    private
    protected
    default*/


    public void print(){
        System.out.println("AAA");
    }

    public int sum(){
        return 1 + 2;
    }
    public String aaa(){
        return "AAA";
    }

    public void sumPrint (int a, int b){
        System.out.println(a + b);
    }

    public int sumRetun(int a , int b){
        return a + b ;
    }




}
