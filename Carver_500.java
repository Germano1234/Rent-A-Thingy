
public class Carver_500 extends Boat{
	private double horsePower;
	public Carver_500()
	{
		super();
		horsePower = 1000;
		rentalPrice = 500;
	}
	public void setHorsePower(double horsePower)
	{
		this.horsePower = horsePower;
	}
	public double getHorsePower()
	{
		return horsePower;
	}
	
	@Override
	public String toString()
	{
		return "Carver 500 made with " + horsePower + " HP";
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
