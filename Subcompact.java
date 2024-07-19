
public class Subcompact extends Car{
	private final String Kia = "Kia Rio";
	private final String Chevrolet = "Chevrolet Volt";
	private double horsePower;
	private String car;
	public Subcompact(int number)
	{
		super();
		if (number == 0)
		{
			car = Kia;
			horsePower = 300;
			rentalPrice = 300;
		}
		if (number == 1)
		{
			car = Chevrolet;
			horsePower = 400;
			rentalPrice = 400;
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
