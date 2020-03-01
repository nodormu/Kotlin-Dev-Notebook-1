/* 03 Collections and Iteration Part 4*/
/* pass a collection type as a function to a parameter*/
/* This function could also be inside the main*/
fun sayHello(greeting:String, itemsToGreet:List<String>) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}
/*In the above function, we established a actionable variable for the greeting and for the later declared list/array, but have not passed a value to it yet.*/

fun main() {  /* list of things or array of things*/
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi, I've been assigned to the String greeting, for each of these interesting things:  ", interestingThings)
}