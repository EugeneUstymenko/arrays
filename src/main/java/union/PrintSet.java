package union;

import java.util.Set;

public class PrintSet {
    public static void printSet(String string, Set<Integer> set) {
        if (set.size() != 0) {
            System.out.print(string + " - ");
            for (Integer currentElement : set) {
                System.out.print(currentElement + " ");
            }
            System.out.println("");
        }
    }
}
