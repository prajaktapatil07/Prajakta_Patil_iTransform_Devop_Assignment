package assignment
//  4-A
def str = "Hello,Groovy!"
 a = str.length()
 println "Characters in Hello,Groovy! are: " +a
 println"==============================================="
// 4-B
 def name = "Prajakta"
 println "Hello $name"
 println"==========================================="
 
//  4-C
 String original = "racecar";
 String reverse = "";

 int length = original.length();

 for(int i = length - 1; i >= 0; i --) {
	 reverse = reverse + original.charAt(i);
 }

 println "Reverse of racecar is : "+reverse
 if (reverse == original) {
	 println "racecar is palindrome"
 }
 else {
	 println "racecar is not palindrome"

 }
 
 println"==============================================="
	
def Orgstr = "Bob"
def Rstr =""
int len = Orgstr.length()

for(int a=len - 1; a >=0; a--) {
	Rstr = Rstr + Orgstr.charAt(a);
	}
	if (Orgstr.equalsIgnoreCase(Rstr)) {
		System.out.println("Bob is Palindrome");
	} else {
		System.out.println("Bob is NOT a Palindrome");
		
	}
	println"==============================================="

	
//	4-D
	String a = "Hello, World. How are you?"
	def b = a.split()
	println b
	
	println".............................."
	//word count
	int count =0;
	for(int i=0;i<=b.length;i++)
	{
	   count++
	}
	
	println "Number of Words are: "+count
	
	println".............................."
	
	//using tokenize
	println a.tokenize()
	println".............................."
	
	//4-E substract world
	
	println a-("World.")
	
	println".............................."
//	4 F-REVERSE
	 c= b.reverse()
	 println c
	println c[4]
	
