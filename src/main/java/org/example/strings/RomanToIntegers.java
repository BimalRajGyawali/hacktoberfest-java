 static int get(char c){

        if(c=='I')

        return 1;

        else if(c=='V')

        return 5;

        else if(c=='X')

        return 10;

        else if(c=='L')

        return 50;

        else if(c=='C')

        return 100;

        else if(c=='D')

        return 500;

        else if(c=='M')

        return 1000;

        

        return 0;

    }

    public int romanToDecimal(String str) {

        // code here

        int sum=0;

        int i=0;

        while(i<str.length()){

            if(i+1<str.length() && get(str.charAt(i))<get(str.charAt(i+1))){

                sum=sum+(get(str.charAt(i+1))-get(str.charAt(i)));

                i=i+2;

            }

            else{

                sum=sum+get(str.charAt(i));

                i++;

            }

        }

        return sum;

    }
