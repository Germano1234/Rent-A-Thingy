
public class Tracker_Pro extends Boat{
	private double horsePower;
	public Tracker_Pro()
	{
		super();
		horsePower = 700;
		rentalPrice = 3000;
	}
	public void setHorsePower(double horsePower)
	{
		this.horsePower = horsePower;
	}
	public double getHorsePower()
	{
		return horsePower;
	}
	
	public String toString()
	{
		return "Tracker Pro made with " + horsePower + " HP";
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
