package ReviewOfCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

    public static void main(String[] args) {

        HashSet<String> stringSet = new HashSet<>();
        Set<Integer> integerSet = new LinkedHashSet<>();

        //1: No Duplicate Items
        //2: No order
        //3: Supports one Null Object

        stringSet.add("Adam");
        stringSet.add("Evan");
        stringSet.add("Maa");
        stringSet.add("Adam");
        stringSet.add(null);
        stringSet.add(null);

        System.out.println(stringSet);

        stringSet.remove("Maa");
        System.out.println(stringSet);

        System.out.println(stringSet.contains("Evan"));

        System.out.println(stringSet.size());
        System.out.println(stringSet.isEmpty());


        //Linked hashSet practices insertion order
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(1);
        integerSet.add(2);
        System.out.println(integerSet);


        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        // TreeSet Sorts the objects based on natural order
        // All sets does not accept duplicate items

        integerTreeSet.add(3);
        integerTreeSet.add(4);
        integerTreeSet.add(1);
        integerTreeSet.add(1);
        integerTreeSet.add(2);

        System.out.println(integerTreeSet);




    }
}
