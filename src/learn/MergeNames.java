package learn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {
//    public static String [] uniqueNames() {
//        String[] names1 = new String[] {"Ava", "Emma", "Olivia","Emma","Emma"};
//        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
//        Set<String> myString1 = new HashSet<String>(Arrays.asList(names1));
//        Set<String> myString2 = new HashSet<String>(Arrays.asList(names2));
//
//
//        System.out.println(myString1);
//
//
//    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia","Emma","Emma"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        Set<String> myString1 = new HashSet<String>(Arrays.asList(names1));
        Set<String> myString2 = new HashSet<String>(Arrays.asList(names2));

        Set<String> result = new HashSet<String>(myString1);
        myString1.addAll(myString2);
        System.out.println(myString1);
        result.addAll(myString2);
        System.out.println(result);


    }

}
