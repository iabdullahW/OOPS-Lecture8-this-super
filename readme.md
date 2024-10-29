# AnimalBehavior

This project demonstrates method overriding in Java and the use of the `super` keyword to access methods from the superclass. The `AnimalBehavior` project defines an `Animal2` class and a `Cat` subclass, where `Cat` overrides the `eat` method and introduces additional behavior.

## Project Structure

- **Animal2 Class**: Defines a method `eat` that prints `"burger"`.
- **Cat Class**: Inherits from `Animal2` and overrides the `eat` method to print `"burger"`. It introduces a `speak` method and a `work` method that demonstrates the use of `super` to access the superclass method.
- **Main Class**: Creates an instance of `Cat` and invokes the `work` method, demonstrating method overriding and superclass method calls.

## Code Overview

### Animal2.java
```java
class Animal2 {
    void eat() {
        System.out.println("burger");
    }
}
class Cat extends Animal2 {
    void eat() {
        System.out.println("burger");
    }
    
    void speak() {
        System.out.println("Cat: Meowww!");
    }
    
    void work() {
        super.eat();  // Calls the eat method from Animal2
        speak();      // Calls the speak method from Cat
        this.speak(); // Calls the speak method from Cat (same as speak())
    }
}
class Lecture8 {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.work();
    }
}
javac Main.java
java Main
burger
Cat: Meowww!
Cat: Meowww!
