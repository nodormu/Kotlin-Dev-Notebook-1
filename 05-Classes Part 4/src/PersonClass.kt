/* 05-Classes Part 4*/
/*Compare with Part 1, Part 2, Part 3 versions for more details on simplification.*/
/*This section consists of adding a method to our PersonClass*/
/*This example also shows that the init blocks will ALWAYS run before the constructor*/
/*Getters and Setters will be automatically generated by the compiler, unless you define them below for debugging logging purposes.*/
/*Note lines 21 and 23 for null versus nickname output!!!!!!!*/
/*ELVIS OPERATOR introduced in line 21. Elvis defined as if the left side of the operator is null, return what is on right hand side of expression instead. */
/*internal*/class PersonClass (val firstname:String = "Luke", val lastname:String = "Skywalker") {
    var nickname:String? = null
        /*To override default implementation of Getter and Setter, such as logging, uncomment next line 3 lines. Example has a custom setter for debugging/output example.*/
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
        /*val nicknameToPrint = if(nickname != null) nickname else "Jedi Master" /*Adding this line will change nickname output from null to Jedi Master. Comment out and test.*/*/
        val nicknameToPrint = nickname ?: "Jedi Knight" /*'?:' is the ELVIS OPERATOR. Comment out 21 and 22, along with testing null vs actual nickname output.*/
        println("$firstname ($nicknameToPrint) $lastname")  /*Changing nicknameToPrint on this line back to nickname, and it will output null. This is simplified from verbose line 22*/
    }
}

/*A note about VISIBILITY MODIFIERS!!!!!
For Classes:
public class PersonClass (etc...) is default
internal class PersonClass (etc...) means it's available to the module, but since we are in a single module, it doesn't change output. Try and see.
private class PersonClass(etc...) means it's only available within the file it's implemented in, which would kill our usage in this main.kt.

For Properties such as:  var nickname
internal var nickname does not change it's implementation in this part.
protected var nickname will not allow the main to access the property nickname. Protected keeps it only accessible in that class, or any sub-classes
private var nickname also keeps it from being accessible outside class or sub-class.

For the Method:  fun printInfo()
internal, protected and private serve same as with property
 */