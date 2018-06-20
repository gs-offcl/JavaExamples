package com.corejava.examples.oops;

interface A1 {
	void a();
	void b();
	void c();
	void d();
}

abstract class M0 implements A1 {
	public void c() {
		System.out.println("M0 - I am c");
	}
}

class M1 extends M0 {

	public void a() {
		System.out.println("M1 - I am a");
	}

	public void b() {
		System.out.println("M1 - I am b");
	}

	public void d() {
		System.out.println("M1 - I am d");
	}
}

class M2 extends M1 {
	public void a() {
		System.out.println("M2 - I am a");
	}

	public void b() {
		System.out.println("M2 - I am b");
	}

	public void d() {
		System.out.println("M2 - I am d");
	}
}

public class AbstTest {
	public static void main(String[] args) {
		A1 a = new M1();
		a.a(); //M1 - I am a
		a.b(); //M1 - I am b
		a.c(); //M0 - I am c
		a.d(); //M1 - I am d
		
		A1 aa = new M2();
		aa.a(); //M2 - I am a
		aa.b(); //M2 - I am b
		aa.c(); //M0 - I am c
		aa.d(); //M2 - I am d
	}
}
