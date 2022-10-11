package org.example.basics;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class DublicateArrayCount {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4};
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int e:arr){
            int count = 1;
            if(!ans.containsKey(e)){
                ans.put(e,count);
            }
            else{
                ans.put(e,ans.get(e)+1);
            }
        }
        List<List<Integer>> rslt = new ArrayList<>();

        for(int e:ans.keySet()){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(e);
            list.add(ans.get(e));
            rslt.add(list);
        }

        System.out.println(rslt);
    }
    
}
