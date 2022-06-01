package union;

import java.util.Set;
import java.util.TreeSet;

public class Intersect {
    public static Set<Integer> intersect(Set <Integer> firstSet, Set <Integer> secondSet) {
        Set <Integer> intersectSet = new TreeSet<>();
        for (Integer firstSetElement : firstSet) {
            for (Integer secondSetElement : secondSet) {
                if (firstSetElement.equals(secondSetElement)) {
                    intersectSet.add(firstSetElement);
                }
            }
        }
        return intersectSet;
    }
}
