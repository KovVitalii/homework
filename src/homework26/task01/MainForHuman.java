package homework26.task01;

public class MainForHuman {

  public static void printHumanInfo(Human human) {
    System.out.println("Hi, my name is " + human.name + ", i'm " + human.age + " years old.");
  }

  public static void main(String[] args) {
    Human human1 = new Human("Maria", 28);
    Human human2 = new Human("Olga", 18);
    Human human3 = new Human("Vadim", 36);
    printHumanInfo(human1);
    printHumanInfo(human2);
    printHumanInfo(human3);
  }
}
