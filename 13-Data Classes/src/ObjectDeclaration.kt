/* 13-Data Classes, 2:07:01 in video*/
object EntityFactory2 {
    fun create2() = Entity2 ("id2", "name -- comes from ObjectDeclaration.kt")
}

class Entity2(val id2: String, val name: String) {
    override fun toString(): String {
        return "id2:$id2, name:$name"
    }
}