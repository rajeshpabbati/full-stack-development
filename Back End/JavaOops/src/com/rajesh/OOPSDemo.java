package com.rajesh;

//a) Class and Object
class Animal {
	String name;

	void display() {
		System.out.println("Animal Name: " + name);
	}
}

//b) Class Constructor
class Dog extends Animal {
	String breed;

	Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	void showDetails() {
		System.out.println("Dog Name: " + name + ", Breed: " + breed);
	}
}

//c) Method Overloading
class MathOperations {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
}

//d) Method Overriding
class Parent {
	void show() {
		System.out.println("Parent Class Method");
	}
}

class Child extends Parent {
	@Override
	void show() {
		System.out.println("Child Class Method");
	}
}

//e) Inheritance
class Vehicle {
	void start() {
		System.out.println("Vehicle is starting...");
	}
}

class Car extends Vehicle {
	void honk() {
		System.out.println("Car is honking...");
	}
}

//f) Interface
interface AnimalSound {
	void makeSound();
}

class Cat implements AnimalSound {
	public void makeSound() {
		System.out.println("Cat says: Meow Meow");
	}
}

//g) Abstract Class
abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing a Circle");
	}
}

public class OOPSDemo {
	public static void main(String[] args) {
		// Class and Object
		Animal animal = new Animal();
		animal.name = "Elephant";
		animal.display();

		// Class Constructor
		Dog dog = new Dog("Buddy", "Labrador");
		dog.showDetails();

		// Method Overloading
		MathOperations mathOps = new MathOperations();
		System.out.println("Addition (2 args): " + mathOps.add(5, 10));
		System.out.println("Addition (3 args): " + mathOps.add(5, 10, 15));

		// Method Overriding
		Parent parent = new Parent();
		parent.show();
		Child child = new Child();
		child.show();

		// Inheritance
		Car car = new Car();
		car.start();
		car.honk();

		// Interface
		Cat cat = new Cat();
		cat.makeSound();

		// Abstract Class
		Shape shape = new Circle();
		shape.draw();
	}
}
