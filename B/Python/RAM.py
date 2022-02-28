class RAM():
	
	capacity = 0 
	price = 0 
	
	def __init__(self, capacity = 0, price = 0):
		self.capacity = capacity
		self.price = price

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