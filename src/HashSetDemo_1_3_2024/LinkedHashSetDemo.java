package HashSetDemo_1_3_2024;

import java.util.Arrays;
import java.util.LinkedHashSet;
//linkedHashSet
//Maintain Ordered collection
//Doesnot allowed duplicate element
//maintain insertion order
//"null" is allowed

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        System.out.println("Add B first time : "+linkedHashSet.add("B"));
        linkedHashSet.add("C");
        linkedHashSet.add(null);
        System.out.println("Add B second time : "+linkedHashSet.add("B"));
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());
        boolean a =  linkedHashSet.contains("B");
        System.out.println("Remove B: "+linkedHashSet.remove("B"));
        boolean b =  linkedHashSet.contains("B");
        System.out.println(linkedHashSet);
        linkedHashSet.isEmpty();

        linkedHashSet.addAll(Arrays.asList("X", "Y", "Z", "P", "Q", "R"));
        System.out.println(linkedHashSet);
        linkedHashSet.removeAll(Arrays.asList("A", "C"));
        System.out.println(linkedHashSet);
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }

	
}
