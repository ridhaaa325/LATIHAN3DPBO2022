from Processor import Processor
from Disk import Disk
from RAM import RAM
from PC import PC

print("Masukkan banyaknya data: ", end = '');
n = int(input())

pOBJ = [Processor() for i in range(n)]
dOBJ = [Disk() for i in range(n)]
rOBJ = [RAM() for i in range(n)]
pcOBJ = [PC() for i in range(n)]

for i in range(n):
    
    print("Data ke -> " + str(i+1))

    procename = str(input("Processor Name   : "))
    pOBJ[i].setName(procename)

    priceProc = int(input("Processor Price  : "))
    pOBJ[i].setPrice(priceProc)

    disktype = str(input("Disk Type : "))
    dOBJ[i].setType(disktype)

    diskcapacity = int(input("Disk Capacity : "))
    dOBJ[i].setCapacity(diskcapacity)

    diskprice = int(input("Disk Price   : "))
    dOBJ[i].setPrice(diskprice)

    ramcapacity = int(input("RAM Capacity   : "))
    rOBJ[i].setCapacity(ramcapacity)

    ramprice = int(input("RAM Price : "))
    rOBJ[i].setPrice(ramprice)

    pcOBJ[i].setCountPrice(pOBJ[i].getPrice(), dOBJ[i].getPrice(), rOBJ[i].getPrice())

for i in range(n):
    print("-------------------------")
    print("Data ke -> " + str(i+1))
    print("-------------------------")
    print("Nama processor   : " + str(pOBJ[i].getName()))
    print("Harga processor  : Rp " + str(pOBJ[i].getPrice()))
    print("+++++++++++++++++++++++++")
    print("Type disk        : " + str(dOBJ[i].getType()))
    print("Kapasitas disk   : " + str(dOBJ[i].getCapacity()) + " GB")
    print("Harga disk       : Rp " + str(dOBJ[i].getPrice()))
    print("+++++++++++++++++++++++++")
    print("Kapasitas RAM    : " + str(rOBJ[i].getCapacity()) + " GB")
    print("Harga RAM        : Rp " + str(rOBJ[i].getPrice()))
    print("+++++++++++++++++++++++++")
    print("Total Harga      : Rp " + str(pcOBJ[i].getCountPrice()))
    print("+++++++++++++++++++++++++")