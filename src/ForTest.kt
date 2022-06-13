class ForTest {

}

fun main() {
//    for(i in 1..10){
//        println(i)
//    }
//
//    for(l in 'A'..'F'){
//        println(l)
//    }

    val hashMap = hashMapOf(1 to "Tom", 2 to "Jack", 3 to "Mike")
    for ((num,name) in hashMap) {
        println("number is $num , name is $name")
    }

//    for (entry in hashMap) {
//        println("number is ${entry.key} , name is ${entry.value}")
//    }
//
//    val list= listOf(1,2,3)
//    for (entry in list){
//        println(entry)
//    }
//
//    val set= hashSetOf(1,2,3)
//    for (entry in set) {
//        println(entry)
//    }

}