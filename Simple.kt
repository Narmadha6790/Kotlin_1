fun main(args:Array<String>){
	
	var name:String="Narmadha"
	println(name)
	name="Gomathi"
	println(name)
	
	val lastname="Raju"
	println(lastname)
	//lastname="Dinesh"
	println(lastname)
	
	var x:Int=10
	var l:Long=x.toLong()
			println(l)
	
	//name=null
	
	var name1:String?="priya"
	println(name1)
	//name1=null
	
	name1?.let{ it:String ->
	val s:String=name1
	println("name is $s")}
	
	println("""hello
 how
 are
  its
  a
  very n
 nice
  weather """)
	
}