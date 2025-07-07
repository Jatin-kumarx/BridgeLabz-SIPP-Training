
package Day5_Inheritance;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " the dog barks");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " the cat meows");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " the bird chirps");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Bruno", 4),
            new Cat("Misty", 2),
            new Bird("Tweety", 1)
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
