/* 05-Classes Part 1*/
/*Initial Testing*/
/*Part 2 Simplifies the code more in the PersonClass.kt file.*/
/*Decided to do a simple println of the property access syntax assignments, even though it's not in the video*/

fun main() {  /* list of things or array of things*/
    val person = PersonClass(_firstname = "Luke", _lastname = "Skywalker")
    person.lastname /*property access syntax, no getter or setter required*/
    person.firstname /*property access syntax, no getter or setter required*/
    println(person.firstname)
    println(person.lastname)
    /* println(person)  -- This does not work and could be a security issue, because it outputs the address block:  PersonClass@2752f6e2*/
}