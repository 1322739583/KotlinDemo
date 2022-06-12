package oop

open class Button : Clickable, Focusable {


    override fun setFocus(b: Boolean) =
        println("I'm ${if (b) "get" else "lost"} focuse")

    final override fun showOff() {
        println("showOff in custom")
    }

    open fun disable() {

    }

}

//fun main() {
//    var b=Button()
//    b.setFocus(true)
//    b.showOff()
//    b.click()
//}