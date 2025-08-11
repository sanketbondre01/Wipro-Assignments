package com.sb.solid;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}

class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish swimming");
    }
}
public class InterfaceSegregationPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new Duck();
        duck.fly();
        duck.swim();
        Fish fish = new Fish();
        fish.swim();

	}

}
