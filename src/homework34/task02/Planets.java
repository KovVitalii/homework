package homework34.task02;

public enum Planets {
  MERCURY("Mercury", 2440, 3302 * (Math.pow(10, 24))),
  VENUS("Venus", 6052, 4896 * (Math.pow(10, 24))),
  EARTH("Earth", 6378, 5974 * (Math.pow(10, 24))),
  MARS("Mars", 3397, 6419 * (Math.pow(10, 23))),
  JUPITER("Jupiter", 71490, 1899 * (Math.pow(10, 27))),
  SATURN("Saturn", 60270, 5685 * (Math.pow(10, 26))),
  URANUS("Uranus", 25560, 8685 * (Math.pow(10, 25))),
  NEPTUNE("Neptune", 24760, 1024 + (Math.pow(10, 26)));

  private String name;
  private double radius;
  private double mass;
  Planets(String name, double radius, double mass) {
    this.name = name;
    this.radius = radius;
    this.mass = mass;
  }

  public String getName() {
    return name;
  }

  public double getRadius() {
    return radius;
  }

  public double getMass() {
    return mass;
  }
}
