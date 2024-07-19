
public class Teleportation_Machine extends Object{
	private String destination;
	public Teleportation_Machine()
	{
		super();
		destination = "Mexico";
		rentalPrice = 30000;
	}
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	public String getDestination()
	{
		return destination;
	}
	
	public String toString()
	{
		return "Teleportation Machine with destination to " + destination + " and back";
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
