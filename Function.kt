package day1
import java.util.*
fun helloworld(){
	println("Hello world")
}
fun main(ars:Array<String>){
	helloworld()
	printWithSpaces("Narmadha")
	println(getCurrentDate())
	println(maximum(10,35))
}

fun printWithSpaces(text:String){
	for(char in text){
		print(char + " ")
	}
}

fun getCurrentDate():Date{
	var currentDate:Date=Date()
	return currentDate
}

fun maximum(a:Int,b:Int):Int{
	if(a>b){
		return a
	}
	else
		{
			return b
		}
}
