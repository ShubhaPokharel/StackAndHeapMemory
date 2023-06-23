package com.pnc.bank;

public class Test {
	
	public static void sayName() {
		System.out.println("Shubha");
		sayBye();
	}
	public static void sayBye() {
		System.out.println(" Pokharel");
		sayName();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayName();

	}

}
