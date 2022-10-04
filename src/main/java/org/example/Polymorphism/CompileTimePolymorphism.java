public class CompileTimePolymorphism {


    // Method with 2 int parameters
    static int multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
}

    class Application {

        public static void main(String[] args) {

            // Calling method by passing input as in arguments
            System.out.println(CompileTimePolymorphism.multiply(8,9));
            System.out.println(CompileTimePolymorphism.multiply(2.5,4.2));
        }
    }