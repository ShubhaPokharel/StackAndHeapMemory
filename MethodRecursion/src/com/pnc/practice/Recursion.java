package com.pnc.practice;

public class Recursion {
	void m1() {
		System.out.println("m1 method");
		m2();
	}
	void m2() {
		System.out.println("m2 method");
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r = new Recursion();
		r.m1();

	}

}
