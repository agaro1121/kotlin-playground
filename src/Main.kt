
data class User(val name: String, val age: Int)

/*
* TODO: Function Composition
* TODO: Extension functions on existing types and new types
* TODO: Futures?
* TODO: Serialization
* TODO: Build Tool?
* TODO:
* TODO:
* TODO:
* TODO:
* TODO:
* */
fun main(args: Array<String>){
    println("Saluton Mondo!")

    val user = User("Anthony", 28)
    println(user)

    val list = listOf(1,2,3,4,5)
    println(list)

    val listPlusOne = list.map { it + 1 }
    println(listPlusOne)

    val reduced = list.fold(0, { a,b -> a + b})
    val reducedWithoutParens = list.fold(0) { a,b -> a + b}
    println(reduced)

    // String Interpolation
    println("$reducedWithoutParens")

    // String interpolation
    println("${reducedWithoutParens}")

    // String interpolation
    println("${user.name}")


}