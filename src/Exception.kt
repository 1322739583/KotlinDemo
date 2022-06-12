fun main() {
    var num=10
    var num2=0
    try {
        if (num2==0)
            throw DivideByZeroException()
        println(num/num2)
    }catch (e:Exception){
        e.printStackTrace()
    }
    println("程序继续运行")

//    var str:String?=null
//    checkNotNull(str)

    val flag=false
    require(flag)
}

class DivideByZeroException : Exception(" / by zero")