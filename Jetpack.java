
public class Jetpack extends Object{
	private String size;
	public Jetpack() {
		super();
		size = "Big";
		rentalPrice = 1000;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}
	@Override
	public String toString()
	{
		return "Jetpack with size " + size;
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}

