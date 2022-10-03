
public class Phone {


        String name;
        String config;
        int cost;
        String os;
        String colour;


        public Phone(String name, String config, int cost, String os,String colour)
        {
            this.name = name;
            this.config = config;
            this.cost = cost;
            this.os = os;
            this.colour= colour;
        }

        // method 1
        public String getName()
        {
            return name;
        }

        // method 2
        public String getConfig()
        {
            return config;
        }

        // method 3
        public int getCost()
        {
            return cost;
        }

        // method 4
        public String getOs()
        {
            return os;
        }

        // method 5
        public String getColour()
        {
            return colour;
        }


        public static void main(String[] args)
        {
            // creating object using new operator
            Phone c1 = new Phone("Apple","i12", 54490,  "IOS14","Red");


            System.out.println("The company name is "+ c1.getName());
            System.out.println("The configuration is "+ c1.getConfig());
            System.out.println("Its Cost is "+ c1.getCost());
            System.out.println("Its operating System "+ c1.getOs());
            System.out.println("Its colour is "+ c1.getColour());

        }
    }




