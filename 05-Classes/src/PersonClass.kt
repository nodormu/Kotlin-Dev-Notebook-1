/* 05-Classes Part 1*/
/*Initial Testing*/
/*Part 2 Simplifies the code more in the PersonClass.kt file.*/

/* this... class PersonClass constructor()  is the same as ... class PersonClass() */
/* IDE will recommend you remove constructor because compiler understands it.*/
class PersonClass (_firstname:String, _lastname:String) {
/* first way to init the strings
    val firstname: String
    val lastname: String

    init {
        firstname = _firstname
        lastname = _lastname */
    /* Second way, and shorter way to init the Strings. No init block required, but both work.*/
    val firstname: String = _firstname
    val lastname: String = _lastname
}