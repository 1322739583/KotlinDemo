fun main() {
    substring()
    split()
    replace()
    `== and ===`()
}

fun `== and ===`() {
    var str1="dog"
    var str2="dog"
    println(str1==str2)
    println(str1===str2)
    var i1=1
    var i2=1

    println(i1==i2)
    println(i1 === i2)

    String


}



private fun replace() {
    var sentance = "This is a dog"
    sentance = sentance.replace("d", "D")
    println(sentance)
    //后面能直接跟大括号是因为最后一个参数是函数类型
    var replaceStr = sentance.replace(Regex("[dog]")) {
        when (it.value) {
            //必须用双引号
            "d" -> "c"
            "o" -> "a"
            "g" -> "t"
            else -> it.value
        }
    }
    println(replaceStr)

}

private fun split() {
    var animals = "dog,cat,duck"
    var (animal1, animal2, animal3) = animals.split(",")
    println("$animal1 $animal2 $animal3")
    var split = animals.split(",")
    for (s in split) {
        println(s)
    }
}

private fun substring() {
    var sentance = "Dog is cute"
    var index = sentance.indexOf(" ")
    println(index)
    // var substring = sentance.substring(0, index)
    //应该熟练记住左右开闭区间是(startIndex,endIndex]
    //var substring = sentance.substring(0, 3)
    //kotlin 支持的新写法
    var substring = sentance.substring(0 until 3)
    println(substring)
}