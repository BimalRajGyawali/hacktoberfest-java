package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int[] arr = {3,4,5};
        char[] chrs = {'a', 'b', 'c', 'd'};
        getPowerSet(chrs, new ArrayList<>(), 0);
    }

    static void getPowerSet(char[] arr, List<Character> localList, int idx){
        if (idx >= arr.length){
            if (localList.size() == 2) System.out.println(localList);
            return;
        }
        localList.add(arr[idx]);
        getPowerSet(arr, localList, idx+1);
        localList.remove(localList.size()-1);
        getPowerSet(arr, localList, idx+1);
    }
}
