package org.example.oop.abstraction;

interface Reptiles {
    void eat();
    void sleep();
}

class Frog implements Reptiles{
    // eat
    @Override
    public void eat(){
        System.out.println("Eat");
    }
    // sleep
    @Override
    public void sleep(){
        System.out.println("Sleep");
    }
    // hopping
    public void hop(){
        System.out.println("Hop");
    }
}

class Snake implements Reptiles{
    // eat
    @Override
    public void eat(){
        System.out.println("Eat");
    }
    // walk
    @Override
    public void sleep(){
        System.out.println("Sleep");
    }
    // crawling
    public void crawl(){
        System.out.println("Crawl");
    }
}

class ReptileInterface {
    public static void main (String[] args) {
        System.out.println("Frog can:");
        Frog frog = new Frog();
        frog.eat();
        frog.hop();

        System.out.println("Snake can:");
        Snake snake = new Snake();
        snake.sleep();
        snake.crawl();
    }
}



