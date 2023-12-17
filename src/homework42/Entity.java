package homework42;

import java.util.Objects;

public abstract class Entity {
String name;
int health;
int attackRoll;

public boolean isAlive (int health) {
if (health <= 0) {
return false;
}
  return true;
}

  public Entity(String name, int health, int attackRoll) {
    this.name = name;
    this.health = health;
    this.attackRoll = attackRoll;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getAttackRoll() {
    return attackRoll;
  }

  public void setAttackRoll(int attackRoll) {
    this.attackRoll = attackRoll;
  }

  @Override
  public String toString() {
    return "Entity{" +
        "name='" + name + '\'' +
        ", health=" + health +
        ", attackRoll=" + attackRoll +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Entity)) {
      return false;
    }
    Entity entity = (Entity) o;
    return health == entity.health && attackRoll == entity.attackRoll && Objects.equals(
        name, entity.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, health, attackRoll);
  }
}
