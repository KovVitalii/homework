package homework42;

public class Mage extends Player {

 public double mana;

  public Mage(String name, int health, int attackRoll, int mana) {
    super(name, health, attackRoll, mana);
    this.mana = mana;
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
