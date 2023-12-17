package homework42;

public class Monster extends Entity {


  public Monster(String name, int health, int attackRoll) {
    super("boo", 20, 3);
    this.name = name;
    this.health = health;
    this.attackRoll = attackRoll;
  }
}
