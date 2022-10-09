public class Polymorphism {

    public static class Sum {
        // Polymorphism is the concept in which we can perform a single action in different ways
        // Polymorphism using method overloading

        public int sum(int x, int y)
        {
            return (x + y);
        }
        public int sum(int x, int y, int z)
        {
            return (x + y + z);
        }
        public double sum(double x, double y)
        {
            return (x + y);
        }
        
    }
    public static void main(String[] args)
        {
            Sum s = new Sum();
            System.out.println(s.sum(10, 20));
            System.out.println(s.sum(10, 20, 30));
            System.out.println(s.sum(10.5, 20.5));
        }
}