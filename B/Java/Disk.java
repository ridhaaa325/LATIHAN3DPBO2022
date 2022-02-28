public class Disk
{
	private String type;
	private int capacity; 
	private int price; 

	public Disk(String type, int capacity, int price)
	{
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}

	public Disk()
	{

	}

	// methods set for type, capacity, and price attribute.
	public void setType(String type)
	{
		this.type = type;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}

	// methods get for type, capacity, and price attribute.
	public String getType()
	{
		return this.type;
	}
	public int getCapacity()
	{
		return this.capacity;
	}
	public int getPrice()
	{
		return this.price;
	}

}