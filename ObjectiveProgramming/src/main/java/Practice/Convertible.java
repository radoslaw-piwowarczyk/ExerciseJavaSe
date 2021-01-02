package Practice;

/**
 * Define a Convertible class representing a car with an opening roof. The car should store
 * information about the name, brand, but also whether it is currently in motion and whether
 * the roof is open. The limitation is that it should not be possible to open or close the
 * roof while the car is in motion. If the car is moving and someone tries to open or fold
 * the roof, an error message should be displayed and the roof should remain in its current
 * position. In a separate class, create an object representing the car and test the opening
 * of the roof when the car is moving and at rest.
 **/

public class Convertible {
    private String name;
    private String brand;
    private boolean roofOpen;
    private boolean moving;

    public Convertible(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if (moving) {
            System.out.println("You cannot open or fold the roof while driving!");
        } else {
            this.roofOpen = roofOpen;
        }
    }
}
