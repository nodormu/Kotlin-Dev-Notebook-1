/* 05-Classes Part 2*/
/*Compare Part 1 and Part 2 versions for more details on simplification.*/
/*It was getting to much to try and rationally include in the same file.*/

/* this... class PersonClass constructor()  is the same as ... class PersonClass() */
/* IDE will recommend you remove constructor because compiler understands it.*/

/*First Simplification of PersonClass*/
/*This example shows that the init blocks will ALWAYS run before the constructor*/
class PersonClass (val firstname:String, val lastname:String) {
    init {
            println("init1")
    }
    constructor(): this("Luke", "Skywalker") {
        println("Secondary Constructor")
    }
    init {
        println("init2")
    }
}