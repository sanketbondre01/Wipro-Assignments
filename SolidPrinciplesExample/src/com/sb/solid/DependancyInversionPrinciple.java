package com.sb.solid;

interface Switchable {
    void turnOn();
    void turnOff();
}

class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light ON");
    }

    public void turnOff() {
        System.out.println("Light OFF");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan ON");
    }

    public void turnOff() {
        System.out.println("Fan OFF");
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(boolean on) {
        if (on) device.turnOn();
        else device.turnOff();
    }
}

public class DependancyInversionPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Switchable light = new Light();
	        Switchable fan = new Fan();

	        Switch lightSwitch = new Switch(light);
	        Switch fanSwitch = new Switch(fan);

	        lightSwitch.operate(true);
	        fanSwitch.operate(true); 
	}

}
