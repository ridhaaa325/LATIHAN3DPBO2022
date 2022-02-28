#include <iostream>
#include <string>

using namespace std;

#include "Processor.cpp"
#include "Disk.cpp"
#include "RAM.cpp"
#include "PC.cpp"

int main()
{
    string processor;
    int proceprice;
    string disktype;
    string diskcapacity;
    int diskprice;
    string ramcapacity;
    int ramprice;

    cout << "Masukkan banyaknya data: ";
    int n;
    cin >> n;
    
    Processor pOBJ[n];
	Disk dOBJ[n];
	RAM rOBJ[n];
	PC PCOBJ[n];
    
    int i = 0;
    for (i = 0; i < n; i++)
    {
        printf("\n");
        cout << "Data ke -> " << (i+1) << endl;
    
        cout << "Nama prosessor     : ";
        cin >> processor;
        pOBJ[i].setName(processor);

        cout << "Harga prosessor    : ";
        cin >> proceprice;
        pOBJ[i].setPrice(proceprice);

        cout << "Type disk          : ";
        cin >> disktype;
        dOBJ[i].setType(disktype);
        
        cout << "Kapasitas disk     : ";
        cin >> diskcapacity;
        dOBJ[i].setCapacity(diskcapacity);

        cout << "Harga disk         : ";
        cin >> diskprice;
        dOBJ[i].setPrice(diskprice);

        cout << "Kapasitas RAM      : ";
        cin >> ramcapacity;
        rOBJ[i].setCapacity(ramcapacity);

        cout << "Harga RAM          : ";
        cin >> ramprice;
        rOBJ[i].setPrice(ramprice);
    }  

    for (i = 0; i < n; i++)
    {
        cout << "\n-------------------------" << endl;
		cout << "Data ke -> " << (i+1) << endl;
		cout << "-------------------------" << endl;
        cout << "Nama prosesor  : " << pOBJ[i].getName() << endl;
        cout << "Harga prosesor : " << pOBJ[i].getPrice() << endl;
        cout << "+++++++++++++++++++++++++" << endl;
        cout << "Type disk      : " << dOBJ[i].getType() << endl;
        cout << "Kapasitas disk : " << dOBJ[i].getCapacity() << endl;
        cout << "Harga disk     : " << dOBJ[i].getPrice() << endl;
        cout << "+++++++++++++++++++++++++" << endl;
        cout << "Kapasitas RAM  : " << rOBJ[i].getCapacity() << endl;
		cout << "Harga RAM      : " << rOBJ[i].getPrice() << endl;
		cout << "+++++++++++++++++++++++++" << endl;
    }

    return 0;
}