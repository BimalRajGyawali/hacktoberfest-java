package org.example.oop.abstraction;

public class CarModel {

    // Abstraction is a process of data hiding (focuses on security)

    // abstract class
    static abstract class Car{
        abstract void turnOnCar();
        abstract String getCarType();
    }

    static class ManualCar extends Car{
        String carType = "Manual";
        void turnOnCar(){
            System.out.println("Turn on the manual car");
        }
        public String getCarType() {
            return this.carType;
        }
    }

    static class AutomaticCar extends Car{
        String carType = "Automatic";
        void turnOnCar(){
            System.out.println("Turn on the automatic car");
        }
        public String getCarType() {
            return this.carType;
        }
    }

    public static void main(String args[]){
        Car manualCar = new ManualCar();
        System.out.println("Car Type: "+manualCar.getCarType());
        manualCar.turnOnCar();

        Car automaticCar = new AutomaticCar();
        System.out.println("Car Type: "+automaticCar.getCarType());
        automaticCar.turnOnCar();
    }

}
