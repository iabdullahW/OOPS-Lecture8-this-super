class Animal2 {
    void eat() {
        System.out.println("burger");
    }
}

class Cat extends Animal2 {
    void eat() {
        System.out.println("abdul");
    }
    
    void speak() {
        System.out.println("Cat: Meowww!");
    }
    
    void work() {
        super.eat();
        eat();      
        this.eat();  // Calls the eat method from the superclass (Animal2)
        speak();      // Calls the speak method from this class
        this.speak(); // Calls the speak method from this class (same as speak())
    }
}

class Lecture8 {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.work();
    }
}