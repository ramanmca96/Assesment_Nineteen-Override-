package com.Project;


class OverrideSameMethods
{
	public int multilication(int a, int b, int c) 
	{
		System.out.println("Given Number Multiplication IS :");
		return a*b*c;
	}
}
class AddMethod extends OverrideSameMethods
{
	public int multiplication(int a, int b, int c)
	{
		System.out.println("Given Number Addition IS:");
		return a+b+c;
	}
}
public class OverrideExample extends AddMethod{

	public static void main(String[] args) {
		OverrideExample cv = new OverrideExample();
		int value = cv.multiplication(2, 20, 0);
		System.out.println(value);
	}

}

	

