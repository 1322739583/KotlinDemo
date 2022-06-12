fun main() {
    val score=10
    if (score in 0..60){
        println("bad")
    }else if (score in 61..80){
        println("not bad")
    }else{
        println("good")
    }


    val gender=3;
    val result=when(gender){
        1->"男"
        2->"女"
        else-> {
            println("未知")
            println("程序退出")
        }
    }
    println(result)

    val animal="dog"
    val color="yellow"
    val age=10
    println("The $animal's color is $color")

    println("The $animal's is $color and ${if(age>5) "old" else "young"}")
}