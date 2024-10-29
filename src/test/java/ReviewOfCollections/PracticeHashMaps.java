package ReviewOfCollections;

import java.util.HashMap;
import java.util.Map;

public class PracticeHashMaps {

    public static void main(String[] args) {

        // Maps accepts two variables, one as key and second as value

        HashMap<Integer,String> employeeMap = new HashMap<>();
        Map<Character,Integer> scoresMap = new HashMap<>();

        // keys cannot be duplicate
        // values can be duplicate
        employeeMap.put(1,"Bob");

        // if we use the put method on the same key it replaces the initial value with the new one.
        employeeMap.put(1,"Adam");
        employeeMap.put(2,"Adam");
        employeeMap.put(3,"Josh");
        employeeMap.put(4,"Simon");

        System.out.println(employeeMap);

        System.out.println(employeeMap.get(1));
        System.out.println(employeeMap.get(2));

        System.out.println(employeeMap.containsKey(3));
        System.out.println(employeeMap.containsValue("Bob"));

        employeeMap.remove(2);
        System.out.println(employeeMap);

        System.out.println(employeeMap.isEmpty());
        System.out.println(employeeMap.size());

        //employeeMap.clear();

        System.out.println( employeeMap.keySet());
        System.out.println( employeeMap.values());
        System.out.println(employeeMap.entrySet());
        System.out.println(employeeMap);

        // What's TreeMap
    }
}
