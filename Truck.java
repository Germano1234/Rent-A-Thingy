
public class Truck extends Car{
	private final String Ford = "Ford F150";
	private final String GMC = "GMC Sierra";
	private double horsePower;
	private String car;
	public Truck(int number)
	{
		super();
		if (number == 0)
		{
			car = Ford;
			horsePower = 500;
			rentalPrice = 600;
		}
		if (number == 1)
		{
			car = GMC;
			horsePower = 600;
			rentalPrice = 700;
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
