package homework25.task02;

import java.util.Scanner;

public class Pen {

  Scanner scanner = new Scanner(System.in);
  int inks = 1000;
  String text = scanner.nextLine();

  public void wright(String text) {
    char[] result = text.toCharArray();
    inks = inks - result.length;
    if (inks >= result.length) {
      System.out.println(result);
      } else {
      System.out.println("Inks are not enough!!!");
    }
  }


  public int checkInk() {
    System.out.println("Rest of inks for " + inks + " symbols!");
    return inks;
  }

  public int refill() {
    inks = 1000;
    System.out.println("Inks are full");
    return inks;
  }
}

