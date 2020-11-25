package se.lexicon.samuel;

public class Dog extends Animal {
    //these are the properties unique to the object Dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //these are the properties being shared
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //adding a method to override a feature like eat
    private void chew(){
        System.out.println("Dog.chew() called");
    }
    @Override //helps us override a method in the main class you do not want to use
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    //to create methods for how a dog would move
    public void walk (){
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run (){
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
