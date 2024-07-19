
public class Marin_Rift extends Bicycle{
	private int numberOfGears;
	public Marin_Rift()
	{
		super();
		numberOfGears = 3;
		rentalPrice = 200;
	}
	public void setNumberOfGears(int numberOfGears)
	{
		this.numberOfGears = numberOfGears;
	}
	public double getNumberOfGears()
	{
		return numberOfGears;
	}
	
	public String toString()
	{
		return "Marin Rift with " + numberOfGears + " gears";
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
