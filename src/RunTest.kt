fun main() {
    var text = "This is a dog"
    var result = text.run {
         text.contains("dog")
    }
    println(result)

    var isContain = text.run(::containDog)
    println(isContain)
}

fun containDog(sentence:String):Boolean=sentence.contains("dog")
