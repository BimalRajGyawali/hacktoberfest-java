// Finding the longest name from an array of strings

public class LongestName{

    public static void main(String[] args){
        String[] nameList = {"Ram", "Hari", "Diwakar", "Purshottam", "Shyam"};

        String longest = findLongestName(nameList);
        System.out.println(longest);

    }
    public static String findLongestName(String[] names){
        int size = names.length;
        String longestName = names[0];
        for(int i=1; i<size; i++){
            if(names[i].length()>longestName.length()){
                longestName=names[i];
            }
        }
        return longestName;
    }
}
