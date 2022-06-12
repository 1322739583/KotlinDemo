fun main() {
    var result: () -> String = {
        val animal = "dog"
        "This is $animal"
    }
    println(result())
    var count = "Kotlining".count()
    var countI = "Kotlining".count({ letter -> letter == 'i' })
    println(count)
    println(countI)

    val result2: (String, Int) -> String = { name, age ->
        val animal = "dog"
        "This is $animal , name is $name , age is $age"
    }

    println(result2("tom", 5))

    val result3: (String) -> String = {
        val animal = "dog"
        "This is $animal , name is $it"
    }

    println(result3("tom"))

    val result4 = { name: String, age: Int ->
        val animal = "dog"
        "This is $animal , name is $name , age is $age"
    }

    var getId = { code: Int, birth: Int, num: Int ->
            "$code$birth$num"
    }

    println(showStudentInfo("Tom") { code, birth, num ->
        "$code$birth$num"
    })

    println(showStudentInfo("Tom", ::foo))

    var bar = foo(1)
    println(bar.invoke("abc"))
}


private fun showStudentInfo( name:String, getId: (Int,Int,Int) -> String): String {
    //必须用大括号
    return   "$name's id is ${getId(300027,20001212,1001)}"
}

private fun foo(  a:Int,b:Int,c:Int ): String {
    return   "$a$b$c"
}



private fun foo(a:Int):(String)->String{
    return {
        "$it"
    }
}