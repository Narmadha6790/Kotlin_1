package day1

fun main(args:Array<String>)
{
	var age:Int=21
	if(age<18)
		{
			println("You are not eligible")
		}
	else if(age>18)
		{
			println("You are eligible")
		}
	else if(age>50)
		{
			println("Sorry your too old")
		}
	else
		{
			println("Age is invalid")
		}
	
	var mode:Int=5
	
	when(mode){
		1->println(" The mode is disabled")
		2->println("the mode is enable")
		3->println("the mode is busy")

	else->	
	println("the mode is corrupted")
	}
	
	
	var x:Int=35
	when (x) {
    in 1..10 -> print("x is in the range")
   35->println("x is 35")
		"Hey there".length->println("x is the length of hey there")
		6*5->println("x is 6*5")
    !in 10..20 -> print("x is outside the range")
    in 50..100 -> print("none of the above")
		
		
	}
		//loops
		
		
var sum=0
	for(i in 1..100)
	{
		sum=sum+i
	}
	println(sum)	
		
	val list=listOf("Java","Kotlin","Python")
	for(element in list){
		println(element)
	}
	
	for((index,value) in list.withIndex()){
		println("element at $index is $value")
	}

	
	//while
	
	var z=9
	while(z>=0){
		println(z)
		z--
	}
	
	var i=1
	while(i<=10)
		{
			println(i)
			i++
		}
	
	
	//break & continue
	
	
	for( c in "Python")
		{
			if(c == 'o')
				{
				break
				}
		
	print(c)
		}
	println()
	
	val list1=listOf("book","table","laptop")
	
	for(str in list1){
		if(!str.contains('o')){
			continue
		}
		}
	
	
	//Nested loops nameing
	
	outer@for(i in 1..10)
		{
			 for(j in 1..10){
				 if( i-j==5){
					 break@outer
				 }
				 println("$i-$j")
					}
				
		}
	}

