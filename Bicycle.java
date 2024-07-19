import java.util.Random;

public abstract class Bicycle extends Vehicle {
	public Bicycle()
	{
		
	}
	
	public static Bicycle createRandomBike() {
        Random random = new Random();

        if (random.nextBoolean()) {
            return new Marin_Rift();
        } else {
            return new Tommaso();
        }
    }
}
