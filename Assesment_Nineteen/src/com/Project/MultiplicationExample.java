package com.Project;

public class MultiplicationExample {

	private int addtionMethod(int a, int b, int c) {
		return a + b + c;
	}

	protected int subractionMethod(int a, int b, int c) {
		return a - b - c;
	}

	int multiPlicationMethod(int a, int b, int c) {
		return a * b * c;
	}

	int divisionMethod(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		MultiplicationExample example = new MultiplicationExample();
		int addition = example.addtionMethod(16560, 534, 42);
		int subraction = example.subractionMethod(104, 53, 24);
		int multiplication = example.multiPlicationMethod(10234, 4565, 62);
		int division = example.divisionMethod(107, 56);
		System.out.println("Given Value Additon : " + addition);
		System.out.println(" Given Value Subtraction : " + subraction);
		System.out.println("Given Value Multiplication : " + multiplication);
		System.out.println("Given Value Divide : " + division);

	}

}
