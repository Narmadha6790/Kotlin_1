package day1


// val lambdaname:Type = {arguementList->codeBody}
fun main(args:Array<String>)
{
val square={number:Int->number*number}
val nine=square(3)
println(nine)
	
	
	val magnitude100String={input:Int->
								val magnitude=input*100
								magnitude.toString()}
	
	println(magnitude100String(200))
	
	
	/* type declaration
 val that:Int->Int ={ three->three}
 val more:(String,Int)->String={str,int->str+int}
 val noReturn:Int->Unit={num->println(num}
 
 */

val sample={a:Int->a}
val samples:(String,Int)->String={str,int->str+int}
val nosample={num:Int->println(num)}

//labda return

val calculateGrade={ grade:Int->
when(grade){
	in 0..40->"Fail"
	in 41..70->"Pass"
	in 71..100->"Distinction"
	else->false

}
}
	val result=calculateGrade(40)
	println(result)
}

