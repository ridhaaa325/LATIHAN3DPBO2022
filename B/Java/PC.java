public class PC
{
	// declare OBJects
	Processor pOBJ = new Processor();
	Disk dOBJ = new Disk(); 
	RAM rOBJ = new RAM(); 
	int CountPrice = 0; 

	// constructor
	public PC(Processor pro, Disk dis, RAM ram, int price)
	{
		this.pOBJ = pro;
		this.dOBJ = dis;
		this.rOBJ = ram;
		this.CountPrice = price;
	}	
	public PC()
	{

	}

	// methods set for attributes
	public void setProcessor(Processor pro)
	{
		this.pOBJ = pro;
	}
	public void setDisk(Disk dis)
	{
		this.dOBJ = dis;
	}
	public void setRAM(RAM ram)
	{
		this.rOBJ = ram;
	}
	public void setCountPrice(int prc1, int prc2, int prc3)
	{
		this.CountPrice = prc1+prc2+prc3;
	}

	// methods get for attributes
	public Processor getProcessor()
	{
		return this.pOBJ;
	}
	public Disk getDisk()
	{
		return this.dOBJ;
	}
	public RAM getRAM()
	{
		return this.rOBJ;
	}
	public int getCountPrice()
	{
		return this.CountPrice;
	}

	//method menampilkan data PC
	public void printPC(){

		System.out.println("-------------------------");
		System.out.println("Processor");
		System.out.println("----------");
		System.out.println("Name     : " + pOBJ.getName());
		System.out.println("Price    : Rp" + pOBJ.getPrice());
		System.out.println("-------------------------");
		System.out.println("Disk");
		System.out.println("----------");
		System.out.println("Type     : " + dOBJ.getType());
		System.out.println("Capacity : " + dOBJ.getCapacity() + " GB");
		System.out.println("Price    : Rp" + dOBJ.getPrice());
		System.out.println("-------------------------");
		System.out.println("RAM");
		System.out.println("----------");
		System.out.println("Capacity : " + rOBJ.getCapacity() + " GB");
		System.out.println("Price    : Rp" + rOBJ.getPrice());
		System.out.println("-------------------------");

		System.out.println("Total Price: Rp" + this.CountPrice);

	}

}