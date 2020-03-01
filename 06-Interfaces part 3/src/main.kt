/* 06-Interfaces part 3:  1:31:37 in video*/
/*This section consists of adding a method to our PersonClass and the interface file.*/

fun main() {  /* list of things or array of things*/
    /*The next 2 lines deal with PersonClass.kt directly, NOT the interface file*/
    val person = PersonClass()
    person.printInfo() /*Added this line for the added lines 18-19 method on PersonClass.*/
    /*The next 2 lines are added to handle the new class in the PersonInfoProvInterface, which includes the PersonClass file. Just supposed to reprint with one added println from interface file.*/
    val provider = BasicInfoProvider()
    provider.printInfo(PersonClass())
    /*the next 3 lines are added because of the typecasting/typesetting in the interface file for fun checkTypes*/
    provider.getSessionID()
    person.printInfo() /*is just text output to show if specified user from PersonClass.kt is a Session provider per the multiple interface handling. This is not added in the tutorial, just so these notes make more sense later on.*/
    checkTypes(provider)
}