package homework25.task01;

public class MainForHuman {

  public static void main(String[] args) {
    Human human1 = new Human();
    Human human2 = new Human();
    Human human3 = new Human();

    human1.name = "Nastya";
    human1.age = 36;

    human2.name = "Vadim";
    human2.age = 19;

    human3.name = "Maria";
    human3.age = 28;

    human1.introduce();
    human2.introduce();
    human3.introduce();
  }
}
