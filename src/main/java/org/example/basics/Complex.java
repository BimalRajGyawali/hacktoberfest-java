import java.util.Scanner;

public class Complex {
		float real,img;
		Complex(){
			
		}
		Complex(float x,float y){
			real=x;
			img=y;
		}
		Complex add(Complex a) {
			Complex temp=new Complex();
			temp.real=this.real + a.real;
			temp.img=this.img + a.img;
			return temp;
		}
		Complex sub(Complex a) {
			Complex temp=new Complex();
			temp.real=this.real - a.real;
			temp.img=this.img-a.img;
			return temp;
		}
		Complex mult(Complex a) {
		    Complex temp=new Complex();
		    temp.real=this.real*a.real-this.img*a.img;
		    temp.img=this.real*a.img+this.img*a.real;
			return temp;
			
		}
		public static void main(String[]args) {
			Complex c1=new Complex(6.6f,5.8f);
			Complex c2=new Complex(7.4f,8.9f);
			Complex res=c1.add(c2);
			Complex res2=c1.sub(c2);
			Complex res3=c1.mult(c2);
			System.out.printf("For complex numbers (6.6+5.8) and (7.4+8.9i)\n");
			System.out.printf("Addition is: %2.2f+%2.2fi\n",res.real,res.img);
			System.out.printf("Subtraction is: %2.2f+%2.2fi\n",res2.real,res2.img);
			
			System.out.printf("Multiplication is: %2.2f+%2.2fi\n",res3.real,res3.img);
			
		}

}
