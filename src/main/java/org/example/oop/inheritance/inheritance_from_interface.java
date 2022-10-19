package weeks_practice;

interface flyable{
    public void fly();
    public default void travel(){
        System.out.println("travel with wings");
    }
}

interface movable{
    public void move();
    public default void travel(){
        System.out.println("travel with legs");
    }
}

class bird implements flyable,movable{
    public void fly(){
        System.out.println("wings");
    }
    public void move(){
        System.out.println("legs");
    }
}

public class test87 {
    public static void main(String[] args) {
        bird a1 = new bird();
        a1.fly();
        a1.move();
//        a1.travel(); It generates an error because flyable amd moveable interfaces both have a default method with same name
    }
}
