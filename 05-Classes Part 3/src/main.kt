/* 05-Classes Part 3*/
/*Compare Part 1 and Part 2 versions for more details on simplification.*/
/*It was getting to much to try and rationally include in the same file.*/
/*Getters and Setters are involved in this section for debuggin/logging in order to avoid default parameters of compiler*/

fun main() {  /* list of things or array of things*/
    val person = PersonClass() /*Remove parameters from inside () and the Secondary Constructor will output to screen*/
    person.lastname /*property access syntax*/
    person.firstname /*property access syntax*/
    println (person.firstname)
    println (person.lastname)
    person.nickname = "Jedi Knight" /*property access syntax*/
    person.nickname = "Jedi Master" /*Added this as a result of custom set in PersonClass, for loggin/debugging.*/
    println(person.nickname) /*Added this as a result of custom get field in PersonClass, for logging/debugging.*/
}