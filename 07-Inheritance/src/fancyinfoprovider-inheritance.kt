/* This class inherits from open class BasicInfoProvider on line 20 in the PersonInfoProviderInterface.kt file. */
class FancyInfoProvider : BasicInfoProvider () {
    /*typing session on the next line will auto-suggest the open val in PersonInfoProvInterface.kt*/
    override val sessionIDPrefix: String
//        get() = super.sessionIDPrefix /*This is the default suggestion, along with another function it suggests that can be used.*/
          get() = "This text comes from the override 'val sessionIDPrefix:String' custom getter in fancyinfoprovider-inheritance.kt file."
    /*If you just start typing prov as in provider in the next line, the IDE will auto suggest the overrider/getter*/
    override val providerInfo: String
        //        get() = super.providerInfo
        /* We are going to type a different getter, then as a test, change val = FancyInfoProvider in the main.kt file. It should output fancyinfoprovider */
        get() = "This text comes from the override 'val providerInfo:String' custom getter in fancyinfoprovider-inheritance.kt file."

    /* by just starting to type print on the next line, the following override is suggested, which is the one we want to user. */
    override fun printInfo(person: PersonClass) {
        super.printInfo(person)
        println("function override text from custom supertype println function in fancyinfoprovider-inheritance.kt file.")
    }
}