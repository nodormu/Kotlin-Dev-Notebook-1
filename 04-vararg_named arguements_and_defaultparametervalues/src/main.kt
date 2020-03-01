/* 04-vararg, named arguements and default parameter values*/
/* This will use both the 03-... part 4, and the vararg to show the difference between the 2*/
/* passing a function type to $greeting in a function as a parameter*/
/* This function could also be inside the main*/
/* The spread operator is introduced here as an '*' before '*arrayOf' */
/* 3 different ways after the sayHello example from the previous section to do a vararg statement */
/* Names arguement syntax can not be mix/matched in a function parameter. It's either all named syntax, or not at all, i.e. greeting5 = and spread operator '*'
can not be mixed unless itemToGreet5 = is included before spread operator *interestingThings
 Incorrect version Example:  sayHello(greeting = "hi", *interestingThing)  ---  This is unacceptable and does not compile
 Correct version Example:  SayHello(greeting = "hi", itemsToGreet = *interestingThing) --- This is correct and does compile.*/
fun sayHello(greeting:String, itemsToGreet: List<String>) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}
fun sayHello2(greeting2:String, vararg itemsToGreet2:String) {
    itemsToGreet2.forEach {itemToGreet2 ->
        println("$greeting2 $itemToGreet2")
    }
}
fun sayHello3(greeting3:String, vararg itemsToGreet3:String) {
    itemsToGreet3.forEach {itemToGreet3 ->
        println("$greeting3 $itemToGreet3")
    }
}
fun sayHello4(greeting4:String, vararg itemsToGreet4:String) {
    itemsToGreet4.forEach {itemToGreet4 ->
        println("$greeting4 $itemToGreet4")
    }
}
fun sayHello5(greeting5:String, vararg itemsToGreet5:String) {
    itemsToGreet5.forEach {itemToGreet5 ->
        println("$greeting5 $itemToGreet5")
    }
}
fun defaultstring(greeting5:String = "What up... I'm default", string1:String = "String from function.") = println("$greeting5 $string1")
/*In the above function, we established a actionable variable for the greeting and for the later declared list/array, but have not passed a value to it yet.*/

fun main() {  /* list of things or array of things*/
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    val interestingThings2 = arrayOf("Kotlin 3", "Programming 3", "Comic Books 3")
    sayHello("Hi, I've been assigned to the String greeting, for each of these interesting things:  ", interestingThings)
    println("\n") /*just for neatness*/
    sayHello2(greeting2 = "Hi2", itemsToGreet2 = *arrayOf("Kotlin 2", "Programming2", "Comic Books 2"))  /*We don't have to pass the above list, we can create another.*/
    println("\n") /*just for neatness*/
    sayHello3("Hi3", *interestingThings2) /*When I try to type greeting3: in the IDE, it doesn't accept it, so I just started typing "Hi" and it auto added it*/
    println("\n") /*just for neatness*/
    sayHello3(greeting3 = "Hi3a", itemsToGreet3 = *interestingThings2)  /*Second way to do sayHello3 in main, using spread operation '*'.*/
    println("\n") /*just for neatnetss*/
    sayHello3(itemsToGreet3 = *interestingThings2, greeting3 = "Hi3b") /*Third way to to do sayHello3 in main, where as assignements do not have to be in order with this method since they are directly assigned.*/
    println("\n") /*just for neatnetss*/
    sayHello4("Hi4", "itemsToGreet4", "auto-adds", "when you start typing") /*Original way as described in video. Took a min to figure out. see CLI output.*/
    println("\n") /*just for neatnetss*/
    defaultstring() /* No parameters, just pulling default strings*/
    println ("\n") /*just for neatness*/
    defaultstring(greeting5 = "I changed the default")
    println ("\n") /*just for neatness*/
}