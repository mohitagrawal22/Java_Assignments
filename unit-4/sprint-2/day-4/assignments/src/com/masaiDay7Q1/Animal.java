package com.masaiDay7Q1;

public abstract class Animal {
	public abstract void makeNoise();
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void walk() {
		System.out.println("Animal is walking");
	}
}


class Dog extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("Barking...");
	}
	
	public void handShake() {
		System.out.println("Dog is handshaking");
	}
}


class Cat extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("Meaw...");
	}
	
}


class Tiger extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("Roaring....");
	}
}



class Demo{
	
	public Animal[] getAnimals() {
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();
		return animals;
	}
	
	
	public static void main(String[] args) {
		
		Animal[] animals = new Demo().getAnimals();
		
		for(int i=0; i<animals.length; i++) {
			animals[i].eat();
			animals[i].walk();
			animals[i].makeNoise();
			if(animals[i] instanceof Dog) {
				Dog d1 = (Dog) animals[i];
				d1.handShake();
			}
			
		}
	}
}