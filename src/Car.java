
public class Car implements ICar {

    int gear = 0;

    public void engineStart() {
        // start engine
    	System.out.println("Engine Start");
    }
    public void changeGear(int newGear) {
        // assign new gear
    }
    public void turnLeft() {
        // turn car to left direction
    }
    public void turnRight() {
        // turn car to right direction
    }
    
    public void enginestop() {
    	System.out.println("Engine Stop");
    }

}