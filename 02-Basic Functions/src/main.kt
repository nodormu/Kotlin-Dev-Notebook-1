fun getGreeting(): String = "Hello Kotlin, welcome to multiple and embedded functions" /* single expression function */
fun getGreeting2() = "Hello Kotlin, This is a simplified way to do the getGreeting() function call."

fun sayHello() {  /*sayHello():Unit is the use of there is nothing useful to assign, and used if not assigning is a problem, but suggestions say Unit isn't necessary*/
        println(getGreeting()) /*This is the sayHello function call, which is the last thing called in the main function.*/
}

fun main() {
        println("Hello World of Basic Functions in Kotlin.")
        println(getGreeting())
        sayHello()
        println(getGreeting2())
}