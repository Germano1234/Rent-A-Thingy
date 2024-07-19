import java.util.Random;

public class RentableFactory {
    public static Rentable create(String purpose) {
    	
    	Random random = new Random();
    	
    	if ("Fly by day".equalsIgnoreCase(purpose)) {
            return new Carpet();
        }
    	if ("Fly by night".equalsIgnoreCase(purpose)) {
            return new Broom();
        }
    	if ("Slide on snow".equalsIgnoreCase(purpose)) {
            return new Sleigh();
        }
    	if ("Ride on water".equalsIgnoreCase(purpose)) {
            return Boat.createRandomBoat();
        }
    	if ("Ride slowly".equalsIgnoreCase(purpose)) {
            return Bicycle.createRandomBike();
        }
    	if ("Racing".equalsIgnoreCase(purpose)) {
    		int number = random.nextInt(3);
            return new Sports_Car(number);
        }
    	if ("Family vehicle".equalsIgnoreCase(purpose)) {
    		int number = random.nextInt(2);
    		return new SUV(number);
        }
    	if ("Inner city ride".equalsIgnoreCase(purpose)) {
    		int number = random.nextInt(2);
    		return new Subcompact(number);
        }
    	if ("Transporting stuff".equalsIgnoreCase(purpose)) {
    		int number = random.nextInt(2);
    		return new Truck(number);
        }
    	if ("Smooth ride".equalsIgnoreCase(purpose)) {
    		int number = random.nextInt(2);
    		return new Luxury_Sedan(number);
        }
    	if ("Fly Fast".equalsIgnoreCase(purpose)) {
            return new Jetpack();
        }
    	if ("Teleport".equalsIgnoreCase(purpose)) {
            return new Teleportation_Machine();
        }
    	return null;
    }
}