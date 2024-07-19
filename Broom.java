
public class Broom extends Object{
	private String material;
	public Broom()
	{
		super();
		material = "wood";
		rentalPrice = 30;
	}
	public void setMaterial(String material)
	{
		this.material = material;
	}
	public String getMaterial()
	{
		return material;
	}
	
	@Override
	public String toString()
	{
		return "Broom made of " + material;
	}
	
	@Override
	public double getRentalPrice()
	{
		return rentalPrice;
	}
}
