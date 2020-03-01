/* 12-Sealed Classes, 1:58:16 in video*/
/* val provider = FancyInfoProvider()  was added as an option to test inheritance as setup in fancyinfoprovider-inheritance.kt, and class BasicInfoProvider had to be changed to an open class for inheritance to work.*/
/* Pay attention to the difference between protected open and open val in PersonInfoProvInterface.kt */

fun main() {  /* list of things or array of things*/
    /*The next 2 lines deal with PersonClass.kt directly, NOT the interface file*/
    val person = PersonClass()
    person.printInfo() /*Added this line for the added lines 18-19 method on PersonClass.*/

    /*The next 2 lines are added to handle the new class in the PersonInfoProvInterface, which includes the PersonClass file. Just supposed to reprint with one added println from interface file.*/
    //val provider = BasicInfoProvider() /*This is commented out in order to test inheritance of our fancyinfoprovider-inheritance.kt file. */
    //val provider = FancyInfoProvider() /*The val in the above statement had to be changed in order to see the text output from the inherited class in fancyinfoprovider-inheritance.kt */
    /*Reference the 07-Inheritance Section for compiled usage of above 2 lines*/

    /*08-Object Expression Section*/
    val provider = object :
        PersonInfoProvInterface { /*This line replaces both lines above that were used in the Inheritance section.*/
        override val providerInfo: String
            get() = "This text comes from main.kt for the 08-Object Expression section."

        fun getSessionID() = "id" /*This was added to keep provider.getSessionID() from being invalid*/
    }
    provider.printInfo(PersonClass())
    /*End 08 Object Expression Section*/

    /*07-Interfaces Section*/
    /*the next 3 lines are added because of the typecasting/typesetting in the interface file for fun checkTypes for the 07-Interfaces section.*/
    provider.getSessionID()
    person.printInfo() /*is just text output to show if specified user from PersonClass.kt is a Session provider per the multiple interface handling. This is not added in the tutorial, just so these notes make more sense later on.*/
    checkTypes(provider)
//    provider.sessionIDPrefix /*This will ONLY be available as a suggestion in the public API in the IDE --IF-- open val sessionIDPrefix is set in PersonInfoProvider.kt file. If it's protected open val sessionIDPrefix, then it will not work, or autosuggest in public API, but still be available for fancyinfoprovider-inheritance.kt. GOOD SECURITY!*/
    /*End 07-Interfaces Section*/

    /*09-Companion Object section of main*/
    println(Entity.create()) /*outputs memory address*/
    Entity.id /* This references as it would in java. This is good practice for java/kotlin interoperability in regards to static fields in java.*/
    println(Entity.id) /*Print line added to just show the Entity.id. He didn't do this in the video.*/
    println(Entity.getId()) /*Print line added to just show that the override of fun getId()in EntityFactory-CompanionObjects.kt works. He didn't do this in the video.*/
    /*End 09-Companion Object section of main. Nothing is outputted to the console when build/running program.*/

    /*10-Object Declaration section starts. Refer to ObjectDeclaration.kt*/
    val entityval2 = EntityFactory2.create2()
    println(entityval2)
    /*End 10-Object Declaration section*/

    /*11-Enum Classes Section*/
    println("The next 3 output lines are from EnumClass.kt")
    val entityval5: Entity3 = EntityFactory3.create3(Entity3Type.EASY)
    val entityval6: Entity3 = EntityFactory3.create3(Entity3Type.MEDIUM)
    val entityval7: Entity3 = EntityFactory3.create3(Entity3Type.HARD)
    println(entityval5)
    println(entityval6)
    println(entityval7)
    /*End 11-Enum Classes Section*/

    /*12-Sealed Classes*/
    /* I'm not sure why kotlin.Unit outputs to screen after each section that is not just text.*/
    val entityval8: Entity3 = EntityFactory3.create3(Entity3Type.HELP)
    val msg1: String
    msg1 = when (entityval8) {
        Entity3.Help -> println(Entity3.Help.name4).toString() /*Swap out this with "Help Class", and you will see that Kotlin.Unit does not output.*/
        is Entity3.Easy -> "Easy Class"
        is Entity3.Medium -> "Medium Class"
        is Entity3.Hard -> "Hard Class"
    }
    println(msg1)

    val entityval9: Entity3 = EntityFactory3.create3(Entity3Type.EASY)
    val msg2: String
    msg2 = when (entityval9) {
        Entity3.Help -> println(Entity3Type.HELP.getFormattedName()).toString()
        is Entity3.Easy -> println(Entity3Type.EASY.getFormattedName()).toString()
        is Entity3.Medium -> println(Entity3Type.MEDIUM.getFormattedName()).toString()
        is Entity3.Hard -> println(Entity3Type.HARD.getFormattedName()).toString()
    }
    println(msg2)
    /*End 12-Sealed Classes section*/
}