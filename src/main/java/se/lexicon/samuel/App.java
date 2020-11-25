package se.lexicon.samuel;

public class App 
{
    public static void main( String[] args ) {
    Animal animal = new Animal("Animal", 1, 1, 5,5);

    Dog dog = new Dog("Yorkie", 8,20,2 ,4,1, 20, "long silky");
    //extending the eat method to the dog class
    dog.eat();
    dog.walk();
    dog.run();
    }
}
