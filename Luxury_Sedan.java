
public class Luxury_Sedan extends Car{
	private final String Cadillac = "Cadillac ATS";
	private final String Audi = "Audi A8";
	private String car;
	private double horsePower;
	public Luxury_Sedan(int number)
	{
		super();
		if (number == 0)
		{
			car = Cadillac;
			horsePower = 500;
			rentalPrice = 500;
		}
		if (number == 1)
		{
			car = Audi;
			horsePower = 600;
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
	
	@Override
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
