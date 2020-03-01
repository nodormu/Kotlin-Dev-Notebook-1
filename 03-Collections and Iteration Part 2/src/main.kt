/* 03 Collections and Iteration Part 2*/
/*sayHello() is a top level function, and not used in this section.*/

fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {  /* An array is a collectinon of things*/
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size) /*gets the size of the array which is 3*/
    println(interestingThings[0]) /*will get Kotlin*/
    println(interestingThings.get(2)) /*will get Comic Books, and is same thing and above line without get*/

    /*FIRST way to run an iteration outputting all 3 members of array.*/
    /*'.forEach' is a kotlin standard library function. The '.' is representative.*/
    interestingThings.forEach {
        println(it)
    }

    /*SECOND way to run same iteration all 3 members of array, using lambda syntax.*/
    /*(it) can be misleading/misunderstood, so the below method can be invoked in direct reference to the var/val*/
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    } /*lambda arguement can be moved into parenthesis per IDE suggestion, but does not have to be.*/

    /*THIRD way to run an iteration, but with the index reference included AND using lamda syntax*/
    interestingThings.forEachIndexed({ index, interestingThing ->
        println("$interestingThing is at index $index")
    })  /*Moving the lambda arguement into parenthesis was not needed in this context, but was an IDE suggestion*/
}