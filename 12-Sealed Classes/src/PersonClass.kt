/* 12-Sealed Classes, 1:58:16 in video*/
/*Getters and Setters will be automatically generated by the compiler, unless you define them below for debugging logging purposes.*/
/*Note lines 18 and 20 for null versus nickname output!!!!!!!*/
/*ELVIS OPERATOR '?:' introduced in line 19. Elvis defined as if the left side of the operator is null, return what is on right hand side of expression instead. */
class PersonClass (val firstname:String = "Luke", val lastname:String = "Skywalker") {
    var nickname:String? = null
        /*To override default implementation of Getter and Setter, such as logging, below is an example that has a custom setter/getter for debugging/output example.*/
        set(value) {
            field = value /*Without this value of nickname field would never be updated. */
            println("the new nickname is $value")
        }  /* Added this in main.kt as a result of custom set in this class:  person.nickname = "Jedi Master"*/
        get() {
            println("The returned value is $field")
            return field
        }  /* Added this in main.kt as a result of custom get in this class:  println(person.nickname)*/
    /*Create method for this 05-Classes Part 4 here (current section), which in this case we will use a function as an example.*/
    fun printInfo() {
        val nicknameToPrint= if(nickname != null) nickname else "Jedi Master" /*Adding this line will change nickname output from null to Jedi Master. Comment out and test.*/
        //val nicknameToPrint = nickname ?: "Jedi Knight" /*'?:' is the ELVIS OPERATOR. Comment out either 18 or 19, along with testing null vs actual nickname output.*/
        println("$firstname ($nicknameToPrint) $lastname -- which comes from PersonClass.kt")  /*Changing nicknameToPrint on this line back to nickname, and it will output null. This is simplified from verbose line 18*/
    }
}