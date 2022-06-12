fun main() {
    val flag = doSomething(5, "abc")
    println(flag)
    val result = doSomething2()
    println(result)
    var flag2=doSomething(age=5,name="abc")
    println(testUnit(5,"abc"))
    Data.`is`()
    val add= `first we calculate add`(1,2)
    val sub = `second we calculate sub`(1, 2)
    println("$add $sub")
}

private fun doSomething(age:Int,name:String):Boolean{
    return true;
}

private fun doSomething2(a:Int=2,s:String="null"):String{
    return "$a $s";
}

private fun testUnit(age:Int,name:String) {
}

private fun `first we calculate add`(a: Int,b:Int):Int{
    return a+b;
}

private fun `second we calculate sub`(a: Int,b:Int):Int{
    return a-b;
}