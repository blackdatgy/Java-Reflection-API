package com.java.reflection.kunit;

public class Simple {

  public double a = 20.0d;
  private double b = 40.0d;
  
  public Simple() {
  }
  
  public Simple(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public void squareA(){
    this.a *= this.a;
  }

  private void squareB(){
    this.b *= this.b;
  }

  public double getA() {
    return a;
  }

  private void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }
  
  public String toString() {
    return String.format("(a:%f, b:%f)", a, b);
  }

}
