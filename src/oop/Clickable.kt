package oop

interface Clickable {
    fun click() {
        println("This is default impl")
    }
    //或者
    //fun click()= println("This is default impl")

    fun showOff(){
        println("showOff in Clickable")
    }
}