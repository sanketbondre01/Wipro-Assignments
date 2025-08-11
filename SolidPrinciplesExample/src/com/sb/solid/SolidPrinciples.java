package com.sb.solid;

interface PaymentMethod{
	void pay();
}

class creditCard implements PaymentMethod{
	@Override
	public void pay() {
		System.out.println("Process Creditcard payment");
		
	}
}

class debitCard implements PaymentMethod{
	@Override
	public void pay() {
		System.out.println("Process Debitcard payment");
		
}}

class Processor{
	void Process(PaymentMethod paymentMethod) {
		paymentMethod.pay();
	}
}
public class SolidPrinciples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Processor p = new Processor();
   p.Process(new creditCard());
   p.Process(new debitCard());
	}

}