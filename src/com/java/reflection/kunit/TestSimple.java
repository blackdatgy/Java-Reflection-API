package com.java.reflection.kunit;
import static com.java.reflection.kunit.KUnit.*;

/******************************************************************************
 * This code demonstrates the use of the KUnit testing tool. It produces a
 * report that contains messages generated from the check methods.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class TestSimple {

  void checkConstructorAndAccess(){
    Simple s = new Simple(6.0, 8.0);
    checkEquals(s.getA(), 8.0);
    checkEquals(s.getB(), 8.0);
    checkNotEquals(s.getB(), 8.0);    
    checkNotEquals(s.getB(), 10.0);    
  }

  void checkSquareA(){
    Simple s = new Simple(6.0, 8.0);
    s.squareA();
    checkEquals(s.getA(), 36.0);
  }

  public static void main(String[] args) {
    TestSimple ts = new TestSimple();
    ts.checkConstructorAndAccess();
    ts.checkSquareA();
    report();
  }
}
