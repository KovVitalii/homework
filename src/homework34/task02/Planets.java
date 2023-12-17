package homework34.task02;

public enum Planets {
  MERCURY("Mercury"),
  VENUS("Venus"),
  EARTH("Earth"),
  MARS("Mars"),
  JUPITER("Jupiter"),
  SATURN("Saturn"),
  URANUS("Uranus"),
  NEPTUNE("Neptune");

  private String name;

  Planets(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
