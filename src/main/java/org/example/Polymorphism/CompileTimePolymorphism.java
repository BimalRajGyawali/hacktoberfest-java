public class CompileTimePolymorphism {


    static int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
}

    class Application {

        public static void main(String[] args) {
            // Calling method by passing input as in arguments
            System.out.println(CompileTimePolymorphism.Multiply(8,9));
            System.out.println(CompileTimePolymorphism.Multiply(2.5,4.2));
        }
    }
