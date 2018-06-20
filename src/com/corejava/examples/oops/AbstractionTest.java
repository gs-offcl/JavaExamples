package com.corejava.examples.oops;

public class AbstractionTest {

	public static void main(String args[]) {
		
		AbstractionTest obj = new AbstractionTest();
		Vehicle e;

		e = obj.new Car("Car");
		e.display();

		e = obj.new Truck("Truck");
		e.display();
	}

	abstract class Vehicle {

		private String type;

		public Vehicle(String type) {
			this.type = type;
		}

		abstract void display();

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	class Car extends Vehicle {

		public Car(String type) {
			super(type);
		}

		@Override
		void display() {
			System.out.println("Type->" + getType());
		}
	}

	class Truck extends Vehicle {

		public Truck(String type) {
			super(type);
		}

		@Override
		void display() {
			System.out.println("Type->" + getType());
		}
	}
}
