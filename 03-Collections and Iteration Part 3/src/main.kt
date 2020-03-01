/* 03 Collections and Iteration Part 3*/
/*sayHello() is a top level function, and not used in this section.*/
/*this picks up directly at the end of Part 2 with more ways to iterate listing the array members, but didn't want to break existing code*/
fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {  /* An array is a collectinon of things*/
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    } /*lambda short cut is to type this after forEach  (::println)*/
    println("\n") /*Just to add a space for neatness*/
    /* Another way to iterate using the 'mapOf()' function*/
    /* This particular method does NOT pull from the existing array */
    /* It pulls from the collection members established in the variable  below, rather than the interestingThings variable above*/
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) -> println("$key -> $value") }
    println("\n")


    /*The next 2 ways shows how you can take a val that can NOT be reassigned and is IMmutable, and change it to a mutable collection, and the same for the map function as above.*/
    val interestingThings2 = mutableListOf("Kotlin2", "Programming2", "Comic Books2")
    interestingThings2.add("Dogs2")  /*which of course adds Dogs to the list/array*/
    interestingThings2.forEach(::println)  /*This is a lambda shortcut for above array in interestingThings*/
    println("\n")
    /*Now to the mapOf option*/
    val map2 = mutableMapOf(4 to "d", 5 to "e", 6 to "f") /*This creates a mutable collection, that can allow put functions to update the list without altering immutable static list*/
    map2.forEach { (key2, value2:String) -> println("$key2 -> $value2")}
    map2.put(7, "g") /*adds g to 7 in list/array with put function*/
    println("\n") /*Just to add a space for neatness*/
    map2.forEach { (key2, value2:String) -> println("$key2 -> $value2")} /*Print again to include additional list member for output to screen.*/
}