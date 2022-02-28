class Disk():

	type = "" 
	capacity = 0 
	price = 0 
	
	def __init__(self, type = "", capacity = 0, price = 0):
		self.type = type
		self.capacity = capacity
		self.price = price

	# methods set and get for price attribute
	def setType(self, type):
		self.type = type
	
	def getType(self):
		return self.type

	# methods set and get for capacity attribute
	def setCapacity(self, capacity):
		self.capacity = capacity

	def getCapacity(self):
		return self.capacity

	# methods set and get for price attribute
	def setPrice(self, price):
		self.price = price

	def getPrice(self):
		return self.price