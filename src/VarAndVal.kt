fun varExample() {
    // The value assigned to var can be mutable, meaning it can be replaced
    var name = "Sridhar"
    println("First name variable vale is : $name")

    name = "Sital"
    println("Second name variable vale is : $name")

    if (name == "Sridhar") {
        println("The name value is not changed")
        println("Not Mutable")
    } else {
        println("The name value is changed to $name")
        println("Is Mutable")
    }
}

fun valExample() {
    // The value assigned to val can't be mutable, meaning it can't be replaced
    val name = "Sridhar"
    println("First name variable value is: $name")

    // Uncommenting the line below will cause a compile-time error
    // name = "Sital" // ❌ Error: Val cannot be reassigned

    println("Trying to change the value of a 'val' variable is not allowed.")
    println("Therefore, the name remains: $name")
    println("Not Mutable")
}

