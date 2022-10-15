import java.util.Scanner;

public class ReverseOfString {
        public static char ch;
        public static String Rev="";

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your String");
            String str = sc.nextLine();
            System.out.println(reverse(str));
        }
        public static String reverse(String S){
            for(int i =0 ; i<S.length();i++){
                ch= S.charAt(i);
                Rev =ch + Rev ;
            }
            return Rev;
        }
    }
