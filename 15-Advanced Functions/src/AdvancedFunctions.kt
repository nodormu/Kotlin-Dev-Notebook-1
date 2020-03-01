fun printFilteredStrings1(list: List<String>, predicate: (String) -> Boolean) {
    println("\nThe next line is the output of printFilteredStrings1, filtering on K.")
    list.forEach() {
        if (predicate(it)) {
            print(it)
        }
    }
}

fun printFilteredStrings2(list: List<String>, predicate: ((String) -> Boolean)?) {
    println("\nThe next 2 lines is the output for printFilteredStrings2 filtering on J, but only if we don't pass off a value of null to the predicate in the main.kt, otherwise just this statement will output.")
    list.forEach() {
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

fun printFilteredStrings3(list: List<String>, predicate: ((String) -> Boolean)?) {
    println("\nThe next 2 lines is the output for printFilteredStrings3 filtering on C, but also declaring val predicate in the main. Function is identical to printFilteredStrings2, but filters on C instead of J.")
    list.forEach() {
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

fun getPrintPredicate(): (String) -> Boolean {
    return {it.startsWith("J")}
}