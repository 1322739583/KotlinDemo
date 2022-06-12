package func

fun main() {
    var set = hashSetOf(1, 2, 3)
    println(set)
    println(set.joinToString( prefix = "{", postfix = "}" ))



    var list = listOf(1, 9, 6)

    println(list.max())
    println(list.last())


    var map= hashMapOf(1 to "Tom",2 to "Jack")
    println(list.javaClass)
    println(map.javaClass)

}