package Array;

import java.util.*;

public class UnionTwoArrays {

    public static int countUnionArrayElements(Integer[] arr1, Integer[] arr2) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));
        return set.size();
    }

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[] { 85, 25, 1, 32, 54, 6 };
        Integer[] arr2 = new Integer[] { 85, 2 };
        System.out.println(countUnionArrayElements(arr1, arr2));
    }
}
