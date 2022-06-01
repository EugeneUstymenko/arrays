package union;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){

        Set <Integer> firstSet = new TreeSet <> ();
        for (int i = 0; i < 11; i++) {
            firstSet.add(i + 1);
        }
        PrintSet.printSet("First set", firstSet);

        Set <Integer> secondSet = new TreeSet <> ();
        for (int i = 5; i < 15; i++) {
            secondSet.add(i + 1);
        }
        PrintSet.printSet("Second set", secondSet);

        PrintSet.printSet("Union set", Union.union(firstSet, secondSet));
        PrintSet.printSet("Intersect set", Intersect.intersect(firstSet, secondSet));
    }
}
