/* 06-Interfaces*/
/* IMPORTANT Do NOT try to implement BOTH fun overrides in this. This is why the files were separated into parts. Choose one of the other for the sake of learning how these can be implemented in different places.*/
/* This implements the methodology of the function from the previous part 1, that was implemented in the class as an override, but into the interface parameters instead.*/
/* New super type override demonstrated here as well. */
/* View same file in part 1 to compare usage*/
interface PersonInfoProvInterface {
    val providerInfo:String /* You can NOT assign '=' default String values in interface parameters. You will get a compiler error. Assigning them in classes and functions within them is fine, as well as functions in the main.*/

    fun printInfo (person: PersonClass) {
//        println("basicInfoProvider") /*This is commented out due to next line of encapsulating fun providerInfo:String() for the override with the super.printInfo(person) in the next line.*/
        println(providerInfo) /*overridden in the class with super type. Original text in above line. Try swapping out text output for encapsulation and test*/
        person.printInfo() /*as a result, the output reprints println("$firstname ($nicknameToPrint) $lastname") from the PersonClass.kt file in the main.kt a second time, as the first instance outputs class.*/
    }
}


class BasicInfoProvider:PersonInfoProvInterface { /*Created a class that uses the interface file we are in. It becomes an empty class when methods are defined in public interface parameters.*/

    override val providerInfo: String
        get() = "basicInfoProvider (This comes from the class override in interface file, that is overriding the encapsulated val providerInfo:String in the interface public methodology parameters.)"

    override fun printInfo(person: PersonClass) {
        super.printInfo(person)
        println("additional text filler coming from class in interface file. The 3 lines above come from the override getter of the val in the class.")
    }
}