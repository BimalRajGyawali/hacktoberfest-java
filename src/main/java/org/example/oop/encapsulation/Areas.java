public class Areas {

    // Encapsulation is a mechanism of wrapping code and data together in a single unit

    static class Area {
        int length;
        int breadth;
        // constructor to initialize values
        Area(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        public void getArea() {
            int area = length * breadth;
            System.out.println("Area: " + area);
        }
    }
    public static void main(String[] args) {
        Area rectangle = new Area(12, 5);
        rectangle.getArea();
    }
}