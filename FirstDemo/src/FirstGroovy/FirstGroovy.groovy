package FirstGroovy

class FirstGroovy {
	
	def sm
	String st
	int age;
	
	def static sum(a,b=0,c)
	{
		a+b+c
		println a+" "+b+" "+c	
	}
	

	static void main(def args) {
		
		/*FirstGroovy fg=new FirstGroovy(sm:"smit is back",st:"online",age:24)
		fg.setSm("smit")
		println fg.sm +"\n"+fg.st+"\n"+fg.age
		println fg.getSm()*/
		
		/*def s="Dinky"
		s=new Object();
		s=sum(1,54,2)
		println s
		s=sum(1,54)
		println s*/
		
		//--------------------Loops-----------------------------
		def mylist=["Smit's","Dinky",5,569];
		mylist.each {smi->println smi};
		
		//5.times {println it}
		//2.upto(5) {println "$it"}
		4.downto(3) {println it}
		
		
		
		/*
		 * def mygreeting = "Smit"
		 mygreeting = new Object()
		 mygreeting=10
		 println mygreeting
		 //println  a
		 * 
		 */

		//------------------21/8/2014-------------------
		/*
		 def firstName = 'John'
		 def lastName = 'Doe'
		 def a = 3
		 def b = 7
		 println "${lastName}, ${firstName}"
		 println "a + b = ${a + b}"
		 println '${lastName}, ${firstName}'
		 println 'a + b = ${a + b}'
		 */

		/* ---------- 26/8/2014-------------*/
		/*
		 def name = "Mahendra"
		 def lastname = 'SUDA'
		 println name +" "+ lastname
		 def text = " My full name is $name $lastname"
		 println text
		 def fullname = "$name $lastname"
		 println(fullname)
		 // You can do like this also.
		 def name1 = fullname - lastname
		 println(name1)
		 def fullname1 = name1 + lastname
		 println(fullname1)
		 assert fullname[0..7] == name
		 assert fullname[-4..-1] == lastname
		 */

		/*
		 //---------------- Multi-line strings------------------------------
		 //Muliline in single queotes
		 def sentance = '''\
		 This is line 1,
		 This is line 2'''
		 def lines =sentance.split('\n')
		 assert lines.size() == 2
		 println sentance
		 //Muliline in double queotes
		 def address = """
		 MA
		 Whitefiled
		 Bangalore
		 """.trim()
		 def lines1 =address.split('\n')
		 assert lines1.size() == 3
		 println address
		 println lines1.size() == 4
		 */

		/*
		 //-----------------------Slashy strings literals------------------------------
		 /*
		 //Slashy strings behave like GStrings but preserve backslashes. The slashy string are useful when you have to handle the special characters inside the String, this behavior is great for regular expression and directory names.
		 //Below is the example of slashy Strings.
		 // for file system
		 def filepath = /E:\WORK\java-site\content\groovy/
		 // This is plan string
		 def plain = "\n\r\t\b\\\f\$"
		 println(plain)
		 println plain.size()
		 // For special chars
		 def slashy= /\n\r\t\b\\\f\$/
		 println(slashy)
		 println slashy.size()
		 ..*/

		/*
		 //-----------------Substrings-------------------
		 //Below is the example of substings if Groovy strings.
		 // substrings example
		 def string = 'My name is spiderman'
		 string = string-'name'-'is'+ ' gone'
		 println(string)
		 // Replacement
		 println(string.replace('gone','back'))
		 println(string.replace('My','Hi'))
		 */

		/*
		 //---------------------Processing char inside String--------------------------
		 //You can process the each chars of the String in Groovy, There are different way to do this, below is the example of some of char processing.
		 // You can process characters as well
		 assert 'spiderman'.toList() == [
		 's',
		 'p',
		 'i',
		 'd',
		 'e',
		 'r',
		 'm',
		 'a',
		 'n'
		 ]
		 //You also can do like this and process the each char inside string
		 'spiderman' as String[]
		 'spiderman'.split('')
		 'spiderman'.each{}
		 def string = "smit is back"
		 println(string.toList().unique().sort().join())
		 //println string ='spiderman'.split('m')
		 for(int i=0;i<string.toList().size();i++)
		 {
		 println string[i]
		 }
		 */
		
		
		/*---------------Number in Groovy---------------------------------
		def x = 5
		def y = 6
		// You can do normal add
		println(x + y)
		// This is also allowed
		println(x.plus(y))
		// You can check the x in what instance
		println(x instanceof Integer)
 
		// Take the other example
		def a = 5/6
		// Get round value
		def b = a.setScale(4, BigDecimal.ROUND_HALF_UP)
		println(b.toString()) 
		// Add by operator
		println(7+8)
		// Add by method
		println(7.plus(7))
		// Minus by operator
		println(7-6)
		// Minus by method
		println(7.minus(6))
		// Multiply by operator
		println(4*12)
		// Multiply by method
		println(4.multiply(12))
		// mod by operator
		println(45%35)
		// mod by method
		println(45.mod(35))
		// Power by operator
		println(4**2)
		//Power by method
		println(4.power(2))
		//Division by operator
		println(4/3)
		// Division by method
		println(4.div(3))
		// Normal integer division
		println(4.intdiv(3))
		*/
		
		//def outer = {
			//def inner = { it+1 }
			//inner(it+1)
		 // }
		 // assert outer(1) == 3
	}
}
