package com.java.reflection;

class Simple {
}

public class SimpleExample1 
{
	void printName(Object obj)
	{
		Class c = obj.getClass();
		System.out.println(c.getName());
	}

	public static void main(String args[]) {
		Simple s = new Simple();
		SimpleExample1 se = new SimpleExample1();
		se.printName(s);
	}
}
