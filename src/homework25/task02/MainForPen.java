package homework25.task02;

public class MainForPen {

  public static void main(String[] args) {
    System.out.println("The pen contains inks for writing" + " symbols!");
    System.out.println("Enter a text...");

    Pen pen = new Pen();
    pen.wright(pen.text);
    pen.checkInk();
    pen.refill();
    pen.checkInk();
  }
}