import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String processor = "";
		int proceprice = 0;
		String disktype = "";
		int diskcapacity = 0;
		int diskprice = 0;
		int ramcapacity = 0;
		int ramprice = 0;	
		
		int n = 0;   
        System.out.print("Masukkan jumlah inputan: ");
        try{
            n = sc.nextInt();
        }catch(Exception e){}

		System.out.print("\n");
		
		Processor pOBJ[] = new Processor[n];
		Disk dOBJ[] = new Disk[n];
		RAM rOBJ[] = new RAM[n];
		PC PCOBJ[] = new PC[n];
		
		int i = 0;
		for (i = 0; i < n; i++) 
		{
			pOBJ[i] = new Processor();
			dOBJ[i] = new Disk();
			rOBJ[i] = new RAM();
			PCOBJ[i] = new PC();
			
			System.out.println("Data ke -> " + (i+1));
			
			System.out.print("Nama processor	: ");
			try {
				processor = sc.next();
			} catch (Exception e) {}
			pOBJ[i].setName(processor);

			System.out.print("Harga processor	: ");
			try {
				proceprice = sc.nextInt();
			} catch (Exception e) {}
			pOBJ[i].setPrice(proceprice);

			System.out.print("Type disk	: ");
			try {
				disktype = sc.next();
			} catch (Exception e) {}
			dOBJ[i].setType(disktype);
			
			System.out.print("Kapasitas disk	: ");
			try {
				diskcapacity = sc.nextInt();
			} catch (Exception e) {}
			dOBJ[i].setCapacity(diskcapacity);
			
			System.out.print("Harga disk	: ");
			try {
				diskprice = sc.nextInt();
			} catch (Exception e) {}
			dOBJ[i].setPrice(diskprice);
			
			System.out.print("Kapasitas RAM	: ");
			try {
				ramcapacity = sc.nextInt();
			} catch (Exception e) {}
			rOBJ[i].setCapacity(ramcapacity);
			
			System.out.print("Harga RAM	: ");
			try {
				ramprice = sc.nextInt();
			} catch (Exception e) {}
			rOBJ[i].setPrice(ramprice);

			PCOBJ[i].setCountPrice(pOBJ[i].getPrice(), dOBJ[i].getPrice(), rOBJ[i].getPrice());
		}
	
		for (i = 0; i < n; i++) 
		{
			System.out.println("-------------------------");
			System.out.println("Data ke -> " + (i+1));
			System.out.println("-------------------------");
			System.out.println("Name Processor	: " + pOBJ[i].getName());
			System.out.println("Harga Processor	: Rp " + pOBJ[i].getPrice());
			System.out.println("+++++++++++++++++++++++++");
			System.out.println("Type Disk     	: " + dOBJ[i].getType());
			System.out.println("Kapasitas Disk	: " + dOBJ[i].getCapacity() + " GB");
			System.out.println("Harga Disk    	: Rp " + dOBJ[i].getPrice());
			System.out.println("+++++++++++++++++++++++++");
			System.out.println("Kapasitas RAM 	: " + rOBJ[i].getCapacity() + " GB");
			System.out.println("Harga RAM	: Rp " + rOBJ[i].getPrice());
			System.out.println("+++++++++++++++++++++++++");
			System.out.println("Total Harga	: Rp " + PCOBJ[i].getCountPrice());			
			System.out.println("+++++++++++++++++++++++++");
		}
	}

}