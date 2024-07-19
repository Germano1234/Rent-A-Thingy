
public class Tommaso extends Bicycle{
	private int numberOfGears;
	public Tommaso()
	{
		super();
		numberOfGears = 1;
		rentalPrice = 100;
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
		return "Tommaso with " + numberOfGears + " gears";
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
