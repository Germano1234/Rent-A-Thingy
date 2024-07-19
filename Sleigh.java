
public class Sleigh extends Object{
	private String size;
	public Sleigh()
	{
		super();
		size = "Kids";
		rentalPrice = 30;
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
		return "Sleigh with size " + size;
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
