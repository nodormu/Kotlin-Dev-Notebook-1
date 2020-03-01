/* Defining function parameters if you are wanting to change the original value of the function.*/
/*sayHello() is a top level function*/

fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    sayHello(greeting = "Hey", itemToGreet = "Kotlin")
    sayHello(greeting = "Hey", itemToGreet = "code has been updated so only this works.")
    sayHello(greeting = "Hey", itemToGreet = "The video fucks this part up a little bit too. His earlier explanations don't work anymore, \nas msg is default which is why greeting and itemToGreet are blue here, but you HAVE to use these variables. \nSubstituting message for greeting does NOT work.")
}