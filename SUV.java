
public class SUV extends Car{
	private final String Toyota = "Toyota Highlander";
	private final String Ford = "Ford Escape";
	private double horsePower;
	private String car;
	public SUV(int number)
	{
		super();
		if (number == 0)
		{
			car = Toyota;
			horsePower = 450;
			rentalPrice = 500;
		}
		if (number == 1)
		{
			car = Ford;
			horsePower = 500;
			rentalPrice = 600;
		}
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
		return car + " with " + horsePower + "HP";
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
