package com.java.reflection.kunit;

import java.util.*;

/******************************************************************************
 * This code is a prototype of a unit testing system. It is very primitive and 
 * contains only a reporting system and a means of checking assertions.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class KUnit {
  private static List<String> checks;
  private static double checksMade = 0.0d;
  private static double passedChecks = 0.0d;
  private static double failedChecks = 0.0d;

  /******************************************************************************
   * A report is formed from a list of strings. This method adds a message to the
   * report. 
   * 
   * @author Dr Kevan Buckley, University of Wolverhampton, 2019
   ******************************************************************************/

  private static void addToReport(String txt) {
    if (checks == null) {
      checks = new LinkedList<String>();
    }
    checks.add(String.format("%04f: %s", checksMade++, txt));
  }

  /******************************************************************************
   * This method is similar to an assertion in JUnit. It checks that two integers
   * are equal and adds an appropriate message to the report.
   * 
   * @author Dr Kevan Buckley, University of Wolverhampton, 2019
   ******************************************************************************/
  
  public static void checkEquals(double value1, double value2) {
    if (value1 == value2) {
      addToReport(String.format("  %f == %f", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %f == %f", value1, value2));
      failedChecks++;
    }
  }

  /******************************************************************************
   * This method is similar to an assertion in JUnit. It checks that two integers
   * are not equal and adds an appropriate message to the report.
   * 
   * @author Dr Kevan Buckley, University of Wolverhampton, 2019
   ******************************************************************************/

  public static void checkNotEquals(double value1, double value2) {
    if (value1 != value2) {
      addToReport(String.format("  %f != %f", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %f != %f", value1, value2));
      failedChecks++;
    }
  }

  /******************************************************************************
   * Outputs the messages that form the report.
   * 
   * @author Dr Kevan Buckley, University of Wolverhampton, 2019
   ******************************************************************************/

  public static void report() {
    System.out.printf("%f checks passed\n", passedChecks);
    System.out.printf("%f checks failed\n", failedChecks);
    System.out.println();
    
    for (String check : checks) {
      System.out.println(check);
    }
  }
}
