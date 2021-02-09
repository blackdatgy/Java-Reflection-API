package com.java.reflection;

public abstract class Animal implements Eating
{
	public static String CATEGORY = "domestic";
    private String name;

    protected abstract String getSound();

	public static String getCATEGORY() {
		return CATEGORY;
	}

	public static void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {}
}
