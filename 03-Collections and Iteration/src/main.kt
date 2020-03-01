/* 03 Collections and Iteration Part 1*/
/*sayHello() is a top level function*/

fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size) /*gets the size of the array which is 3*/
    println(interestingThings[0]) /*will get Kotlin*/
    println(interestingThings.get(2)) /*will get Comic Books, and is same thing and above line without get*/

    for (interestingThing in interestingThings) {
        println(interestingThing)
    } /* this is a for loop that prints all 3 members of the array in positions 0, 1, 2, 3, etc*/
}