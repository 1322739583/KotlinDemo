fun main() {
 //  var str: String = "dog"
   //  str=null
    var str="123"

    str!!.capitalize()
   // str?.capitalize()

//     str=str?.let {
//        if (it.isNotBlank()) {
//            it.capitalize()
//        } else {
//            "dog"
//        }
//    }
    if (str!=null){

    }

    str = str?.capitalize()?.plus("is cute")
    println(str)


    println(str)
}