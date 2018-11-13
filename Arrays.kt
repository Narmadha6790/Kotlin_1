package day1

fun main(args:Array<String>)
{
	val array=arrayOf("Texas","Iowa","California")
	val mixed=arrayOf("Kotlin",17,3.0,false)
	val numbers =intArrayOf(1,2,3,4,5)
	val states=arrayOf("Nevada","Florida")
	
	if(states.contains("Kentucky"))
		{
			println("available")
		}
	println(mixed[0])
	
	mixed[2]=78
	println(mixed[2])
	mixed.set(3,true)
	println(mixed[3])
	
	val str="Kotlin"
	println(str[2])
	
	
	val fname=arrayOf("Narmadha","Dinesh","Shivyaa")
	val lname=arrayOf("Raju","Sriramar","Dinesh")
	val name=fname+lname
	for(i in name)
		{
			println(i)
		}
	
	
	val empty:Boolean=numbers.isEmpty()
	
	
}