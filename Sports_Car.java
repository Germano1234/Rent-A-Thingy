
public class Sports_Car extends Car{
	private final String Ferrari = "Ferrari 488";
	private final String Bugatti = "Bugatti Veyron";
	private final String Porsche = "Porsche 911";
	private String car;
	private double horsePower;
	public Sports_Car(int number)
	{
		super();
		if (number == 0)
		{
			car = Ferrari;
			horsePower = 500;
			rentalPrice = 500;
		}
		if (number == 1)
		{
			car = Bugatti;
			horsePower = 600;
			rentalPrice = 600;
		}
		if (number == 2)
		{
			car = Porsche;
			horsePower = 700;
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
