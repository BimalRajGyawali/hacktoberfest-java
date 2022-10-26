class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int m=0,n=0;
        ArrayList<Integer> ARR = new ArrayList<Integer>();
        ArrayList<Integer> ARR1 = new ArrayList<Integer>();
        ArrayList<Integer> ARR2 = new ArrayList<Integer>();
        for(int i=0;i<s.size();i++){
            if((s.get(i)).equals(word1)){
                ARR1.add(i);
            }
            
        }
        for(int i=0;i<s.size();i++){
            if((s.get(i)).equals(word2)){
                ARR2.add(i);
            }
        }
        for(int i=0;i<ARR1.size();i++){
            for(int j=0;j<ARR2.size();j++){
                ARR.add(Math.abs(ARR1.get(i)-ARR2.get(j)));
            }
        }
        return (Collections.min(ARR));
      
    }
