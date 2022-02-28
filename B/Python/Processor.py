class Processor():

	name = ""
	price = 0 

	def __init__(self, name = "", price = 0):
		self.name = name
		self.price = price

	# methods set and get for name attribute
	def setName(self, name):
		self.name = name

	def getName(self):
		return self.name

    # methods set and get for price attribute
	def setPrice(self, price):
		self.price = price

	def getPrice(self):
		return self.price
