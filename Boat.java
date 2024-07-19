import java.util.Random;

public abstract class Boat extends Vehicle{
	public Boat()
	{
		
	}
	
	public static Boat createRandomBoat() {
        Random random = new Random();

        if (random.nextBoolean()) {
            return new Carver_500();
        } else {
            return new Tracker_Pro();
        }
    }
}
