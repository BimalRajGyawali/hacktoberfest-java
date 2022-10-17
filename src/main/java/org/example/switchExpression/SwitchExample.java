package org.example.switchExpression;

/**
 * @author rajeshp
 * @Date 10/17/22
 */
public class SwitchExample {

    private static int getSwitchValue(String mode) {

        int result = switch (mode) {
            case "a", "b" -> 100;
            case "c" -> 200;
            case "d", "e", "f" -> {
                System.out.println("Can add more logic before this");
                yield 300;
            }
            default -> 0;
        };
        return result;
    }


    public static void main(String[] args) {

        System.out.println(SwitchExample.getSwitchValue("a"));

        System.out.println(SwitchExample.getSwitchValue("c"));

        System.out.println(SwitchExample.getSwitchValue("d"));

        System.out.println(SwitchExample.getSwitchValue("z"));



    }
}
