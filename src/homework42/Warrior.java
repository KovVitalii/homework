package homework42;

public class Warrior extends Player {

  public int armor;

  public Warrior(String name, int health, int attackRoll, int armor) {
    super(name,health, attackRoll, armor);
    this.armor = armor;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
