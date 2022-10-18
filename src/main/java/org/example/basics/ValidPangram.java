package org.example.basics;

    public class ValidPangram
    {
        public static boolean isPangram(String sentence)
        {
            Set<Character> unique = new HashSet<>();
            for(int i=0; i<sentence.length(); i++)
            {
                char check = sentence.charAt(i);
                unique.add(check);
            }
            return unique.size() == 26;
        }

        public static void main(String[] args)
        {
            String s = "thequickbrownfoxjumpsoverthelazydog";
            System.out.println(isPangram(s));
        }
    }
