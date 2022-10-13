import java.util.*;
class Caesar_cipher{
    public static String encrypt(String s,int key){
        StringBuffer sencrypt = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int j = (((int)c-97+key)%26)+97;
            char a = (char)j;
            sencrypt.append(a);
        }
        return sencrypt.toString();
    }
    public static String decrypt(String s,int key){
        StringBuffer dncrypt = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int j = (((int)c-97-key)%26)+97;
            char a = (char)j;
            dncrypt.append(a);
        }
        return dncrypt.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice 1 to encrpyt and 2 to decrypt: ");
        int ch=sc.nextInt();
        if(ch==1){
          System.out.println("Enter the plaintext: ");
          String s = sc.next().toLowerCase();
          System.out.println("Enter encrypted key: ");
          int n = sc.nextInt();
          String encrypted = encrypt(s,n);
          System.out.println("Encrypted text is: ");
          System.out.println(encrypted);
        }
        if(ch==2){
          System.out.println("Enter text to decrypt: ");
          String s=sc.next().toLowerCase();
          System.out.println("Enter the private key: ");
          int n=sc.nextInt();
          System.out.println("Decrypted message is: ");
          String dencrypted = decrypt(s,n);
          System.out.println(dencrypted);
          sc.close();
        } 
    }
}
