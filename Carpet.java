
public class Carpet extends Object{
	private String pattern;
	public Carpet()
	{
		super();
		pattern = "pink and purple";
		rentalPrice = 25;
	}
	public void setPattern(String pattern)
	{
		this.pattern = pattern;
	}
	public String getPattern()
	{
		return pattern;
	}
	@Override
	public String toString()
	{
		return "Carpet with a " + pattern + " pattern";
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
