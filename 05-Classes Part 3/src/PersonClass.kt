/* 05-Classes Part 3*/
/*Compare with Part, Part 2 versions for more details on simplification.*/
/*It was getting to much to try and rationally include in the same file.*/

/* this... class PersonClass constructor()  is the same as ... class PersonClass() */
/* IDE will recommend you remove constructor because compiler understands it.*/

/*Second Simplification of PersonClass*/
/*This example shows that the init blocks will ALWAYS run before the constructor*/
/*Witness the power of default parameter values in primary constructor, unless you add additional set and get below. Comment out and compare.*/
/*Getters and Setters will be automatically generated by the compiler, unless you set and get as below for logging/debuggin purposes*/
class PersonClass (val firstname:String = "Luke", val lastname:String = "Skywalker") {
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
}