package union;

import java.util.Set;
import java.util.TreeSet;

public class Union {
    public static Set<Integer> union(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set <Integer> unionSet = new TreeSet<>();
        unionSet.addAll(firstSet);
        unionSet.addAll(secondSet);
        return unionSet;
    }
}
