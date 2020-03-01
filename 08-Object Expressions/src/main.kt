/* 08-Object Expressions, 1:43:07 in video*/
/* val provider = FancyInfoProvider()  was added as an option to test inheritance as setup in fancyinfoprovider-inheritance.kt, and class BasicInfoProvider had to be changed to an open class for inheritance to work.*/
/* Pay attention to the difference between protected open and open val in PersonInfoProvInterface.kt */

fun main() {  /* list of things or array of things*/
    /*The next 2 lines deal with PersonClass.kt directly, NOT the interface file*/
    val person = PersonClass()
    person.printInfo() /*Added this line for the added lines 18-19 method on PersonClass.*/
    /*The next 2 lines are added to handle the new class in the PersonInfoProvInterface, which includes the PersonClass file. Just supposed to reprint with one added println from interface file.*/
    //val provider = BasicInfoProvider() /*This is commented out in order to test inheritance of our fancyinfoprovider-inheritance.kt file. */
    //val provider = FancyInfoProvider() /*The val in the above statement had to be changed in order to see the text output from the inherited class in fancyinfoprovider-inheritance.kt */

    val provider = object : PersonInfoProvInterface { /*This line replaces both lines above that were used in the Inheritance section. This is for 08-Object Expression section.*/
        override val providerInfo: String
            get() = "This text comes from main.kt for the 08-Object Expression section."

        fun getSessionID() = "id" /*This was added to keep provider.getSessionID() from being invalid*/
    }
    provider.printInfo(PersonClass())

    /*the next 3 lines are added because of the typecasting/typesetting in the interface file for fun checkTypes for the 07-Interfaces section.*/
    provider.getSessionID()
    person.printInfo() /*is just text output to show if specified user from PersonClass.kt is a Session provider per the multiple interface handling. This is not added in the tutorial, just so these notes make more sense later on.*/
    checkTypes(provider)
//    provider.sessionIDPrefix /*This will ONLY be available as a suggestion in the public API in the IDE --IF-- open val sessionIDPrefix is set in PersonInfoProvider.kt file. If it's protected open val sessionIDPrefix, then it will not work, or autosuggest in public API, but still be available for fancyinfoprovider-inheritance.kt. GOOD SECURITY!*/
}