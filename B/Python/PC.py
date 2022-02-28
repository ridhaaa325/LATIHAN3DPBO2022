from Processor import Processor
from Disk import Disk
from RAM import RAM

class PC():

	pOBJ = Processor() 
	dOBJ = Disk() 
	rOBJ = RAM() 
	CountPrice = 0 

	#konstruktor
	def __init__(self, pOBJ = Processor(), dOBJ = Disk(), rOBJ = RAM(), CountPrice = 0):
		self.pOBJ = pOBJ
		self.dOBJ = dOBJ
		self.rOBJ = rOBJ
		self.CountPrice = CountPrice

	# methods set and get for processor object
	def setProcessor(self, pOBJ):
		self.pOBJ = pOBJ
    
	def getProcessor(self):
		return self.pOBJ

    # methods set and get for disk object
	def setDisk(self, dOBJ):
		self.dOBJ = dOBJ

	def getDisk(self):
		return self.dOBJ

	# methods set and get for ram object
	def setRAM(self, rOBJ):
		self.rOBJ = rOBJ

	def getRAM(self):
		return self.rOBJ

	#getter dan setter atribut CountPrice
	def setCountPrice(self, prc1, prc2, prc3):
		self.CountPrice = prc1 + prc2 + prc3

	def getCountPrice(self):
		return self.CountPrice
