package com.sb.solid;

interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow eats seeds");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies in the sky");
    }
}

class Parrot implements Bird {
    @Override
    public void eat() {
        System.out.println("Parrot eats guava");
    }
}
public class LiskovSubstitutionPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingBird sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();

        Bird parrot = new Parrot();
        parrot.eat();

	}

}
