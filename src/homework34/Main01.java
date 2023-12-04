package homework34;

import java.util.Scanner;

public class Main01 {

  public static String TimeOfYear(String month) {
    switch (month.toLowerCase()) {
      case "december":
      case "january":
      case "february":
        return "Winter";
      case "march":
      case "april":
      case "may":
        return "Spring";
      case "june":
      case "july":
      case "august":
        return "Summer";
      case "september":
      case "october":
      case "november":
        return "Autumn";
    }
    return "Unknown";
  }

  public static void main(String[] args) {
    System.out.print("Enter a month: ");
    Scanner scanner = new Scanner(System.in);
    String month = scanner.next();
    System.out.println(TimeOfYear(month));
  }
}
