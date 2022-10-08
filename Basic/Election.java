import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Election
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int Xa,Xb,Xc;
		int T;
		T=sc.nextInt();
		if(1<=T&&T<=500)
		{
		    for(int i=1;i<=T;i++)
		   { Xa=sc.nextInt();
            Xb=sc.nextInt();
            Xc=sc.nextInt();
            if(1<=Xa&&Xa<=101&&1<=Xb&&Xa<=101&&1<=Xc&&Xc<=101&&(Xa+Xb+Xc)==101)
            {if(Xa>50)
            {System.out.println("A");}
            else if(Xb>50)
            {System.out.println("B");}
            else if(Xc>50)
            {System.out.println("C");}
            else{
                if(Xa>Xb&&Xa>Xc)
                {System.out.println("A");}
                else if(Xb>Xa&&Xb>Xc)
                {System.out.println("B");}
                else if(Xc>Xa&&Xc>Xb)
                {System.out.println("C");}
                else{System.out.println("NOTA");}
            }
           }
	}
}
    }
}