fun main() {
    var result=listOf(1,2,3).last().let {
        it*it
    }
    println(result)
}