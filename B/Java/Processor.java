public class Processor
{
	private String name; 
	private int price; 
	
	public Processor(String name, int price)
	{
		this.name = name;
		this.price = price;
	}

	public Processor()
	{

	}

	// methods set for name and price attribute.
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}

	// methods get for name and price attribute.
	public String getName()
	{
		return this.name;
	}
	public int getPrice()
	{
		return this.price;
	}

}