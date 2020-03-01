/* 06-Interfaces part 2:  1:22:37 in video*/
/*This section consists of adding a method to our PersonClass and the interface file.*/

fun main() {  /* list of things or array of things*/
    /*The next 2 lines deal with PersonClass.kt directly, NOT the interface file*/
    val person = PersonClass()
    person.printInfo() /*Added this line for the added lines 18-19 method on PersonClass.*/
    /*The next 2 lines are added to handle the new class in the PersonInfoProvInterface, which includes the PersonClass file. Just supposed to reprint with one added println from interface file.*/
    val provider = BasicInfoProvider()
    provider.printInfo(PersonClass())
}