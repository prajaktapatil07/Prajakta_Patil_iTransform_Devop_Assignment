package assignment

	def fruits=["Mango" , "Grapes", "Apple", "Banana", "Kivi"]
	
	 //sort alphabetically 
	println fruits.sort()
	
	//sort by length
	println fruits.sort {it.size() }
	
	//sort by length in descending order
	println fruits.sort {-it.size()}
	
	
	
	
	
	
