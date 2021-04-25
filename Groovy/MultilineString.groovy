package assignment

def string= """Hello everyone, 
			this is a Multi-line string,
			example for assignment """
count=0
def vowels=["a","e","i","o","u"]
for (def i in string) {
	for (def j in vowels) {
		if (i==j) {
			count+=1
		
		}
	}
}
println "The number of vowels in the given string is :"+count

// Closure as a filter

//4.	Closures as a filter
//Create a list of numbers. Print all elements greater than zero.

def list=[2,6,-3,0,5,-9]
def filter=list.findAll{it>0}
 println filter