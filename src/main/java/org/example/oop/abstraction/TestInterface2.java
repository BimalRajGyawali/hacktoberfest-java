package org.example.oop.abstraction;

interface Bank{
    float rateOfInterest();
}
class SBI implements Bank{
    public float rateOfInterest(){return 9.15f;}
}
class PNB implements Bank{
    public float rateOfInterest(){return 9.7f;}
}
public class TestInterface2 {
    public static void main(String[] args) {
        SBI b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
        PNB c = new PNB();
        System.out.println("ROI: " + c.rateOfInterest());
    }
}

    