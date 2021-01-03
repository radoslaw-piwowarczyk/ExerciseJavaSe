package Practice;

public class Main {
    public static void main(String[] args) {
        Convertible convertible = new Convertible("M6 Cabrio", "BMW");
        convertible.setRoofOpen(true);
        System.out.printf("Car status. In motion: %s, Roof opened: %s\n", convertible.isMoving(), convertible.isRoofOpen());

        convertible.setMoving(true);
        convertible.setRoofOpen(false);//car is moving, cannot fold the roof
        System.out.printf("Car status. In motion: %s, Roof opened: %s", convertible.isMoving(), convertible.isRoofOpen());
    }
}
