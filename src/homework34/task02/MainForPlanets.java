package homework34.task02;

import java.util.Scanner;

public class MainForPlanets {

  public static String getPlanetsClass(Planets planet) {
    switch (planet) {
      case EARTH:
        return "Class: Habitable";
      case MERCURY:
      case VENUS:
      case MARS:
        return "Lifeless stone";
      case JUPITER:
      case SATURN:
        return "Class: Gas giant";
      case URANUS:
      case NEPTUNE:
        return "Class: Lifeless ice planet";
    }
    return "";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose a planet:");
    for (int i = 0; i < Planets.values().length; i++) {
      System.out.println(i + 1 + ". " + Planets.values()[i].getName());
    }
    int n = scanner.nextInt();
    Planets[] planets = Planets.values();
    System.out.println("You choose planet: " + planets[n - 1].getName() + "\n"
        + getPlanetsClass(planets[n - 1]));
    System.out.println("Radius: " + planets[n - 1].getRadius() + " km.\n"
        + "Mass: " + planets[n - 1].getMass() + " kg.");
  }

}
