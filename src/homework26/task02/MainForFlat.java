package homework26.task02;

public class MainForFlat {

  public static void printFlatInfo(Flat flat) {
    System.out.println("City: " + flat.city + "\nAdress: " + flat.adress + "\nFloor: " + flat.floor
        + "\nRooms: " + flat.rooms + "\nArea: " + flat.area + "\nCosts: " + flat.cost + "\nFurniture: " + flat.furniture + "\nRepair: "
        + flat.repair);
  }

  public static void main(String[] args) {
    Flat flat = new Flat("Berlin", "BerlinerStr 6", 3, 4, 75.5,500, "yes", "yes");
    printFlatInfo(flat);
  }

}
