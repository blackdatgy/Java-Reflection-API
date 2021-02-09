package com.java.reflection;

class Simple1 {
}

public class ReflectionExample1 
{
	void printName(Object obj) 
	{
		Class c = obj.getClass();
		System.out.println(c.getName());
	}

	public static void main(String args[]) {
		Simple1 s = new Simple1();
		ReflectionExample1 t = new ReflectionExample1();
		t.printName(s);
	}
}
