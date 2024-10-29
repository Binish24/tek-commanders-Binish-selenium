package ReviewOfCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 1 : public void display(){}
// 2 : int number = 1000;

public class ArrayListPractice {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        // var namesTwo = new ArrayList<String>();
        List<String> namesThree = new ArrayList<>();
        //************************************************************************************************
        LinkedList<String> namesLinkedList = new LinkedList<>();
        List <Integer> numbersLinkedList = new LinkedList<>();


        namesThree.add("Ahmad");
        namesThree.add("Alex");
        namesThree.add("Tony");
        namesThree.add("Morphy");

        // Methods

        names.add("Ahmad");
        names.add("Alex");
        names.add("Tony");
        names.add("Morphy");
        names.add(2, "Bob");
        System.out.println(names);

        names.remove("Alex");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        System.out.println(names.contains("Tony"));

        System.out.println(names.size());

        System.out.println(names.get(1));

        for(int i = 0 ; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        for(String name : names){
            System.out.println(name);
        }

        names.addAll(namesThree);
       names.removeAll(namesThree);

        System.out.println(names);



    }



}
