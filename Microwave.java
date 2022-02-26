/* The Microwave program implements an application that
* Asks the user for the item being microwaved and how much of
* Of the item is there. It then calculates and displays the
* Amount of time it takes to heat each item given the quantity specified by the user.
*
* @author  Jonathan Kene
* @version 1.0
* @since   2022-02-25
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    double sub = 60;
    double pizza = 45;
    double soup = 105;

    System.out.println("What is the item? ");
    // String input
    String item = myObj.nextLine();

    if (item.equals("sub")) {
      System.out.print("What is the quantity of the item? ");
      // Numerical input
      double quantity = myObj.nextDouble();
      if (quantity == 1) {
        System.out.println("Item time: " + sub + "seconds");
      } else if (quantity == 2) {
        double time = sub * .5;
        double time2 = time + sub;
        System.out.println("Item time: " + time2 + "seconds");
      } else if (quantity == 3) {
        double time = sub + sub;
        System.out.println("Item time: " + time + "seconds");
      }
    } else if (item.equals("pizza")) {
      System.out.print("What is the quantity of the item? ");
      // Numerical input
      double quantity = myObj.nextDouble();
      if (quantity == 1) {
        System.out.println("Item time: " + pizza + "seconds");
      } else if (quantity == 2) {
        double time = pizza * .5;
        double time2 = time + pizza;
        System.out.println("Item time: " + time2 + "seconds");
      } else if (quantity == 3) {
        double time = pizza + pizza;
        System.out.println("Item time: " + time + "seconds");
        myObj.close();
  }
} else if (item.equals("soup")) {
      System.out.print("What is the quantity of the item? ");
      // Numerical input
      double quantity = myObj.nextDouble();
      if (quantity == 1) {
        System.out.println("Item time: " + soup + "seconds");
      } else if (quantity == 2) {
        double time = soup * .5;
        double time2 = time + soup;
        System.out.println("Item time: " + time2 + "seconds");
      } else if (quantity == 3) {
        double time = soup + soup;
        System.out.println("Item time: " + time + "seconds");
        myObj.close();
      }
    }
  }
}
