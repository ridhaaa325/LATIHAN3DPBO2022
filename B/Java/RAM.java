public class RAM
{
	// private attributes
	private int capacity; 
	private int price; 

	// constructor
	public RAM(int capacity, int price)
	{
		this.capacity = capacity;
		this.price = price;
	}
	public RAM()
	{

	}

	// methods set for capacity and price attribute
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}

	// methods get for capacity and price attribute
	public int getCapacity()
	{
		return this.capacity;
	}
	public int getPrice()
	{
		return this.price;
	}
}