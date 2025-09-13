fun stringManipulation() {
    val myPet = "crocodile"

    println("------Find String Length------")
    println(myPet.length)

    println("------Capitalize String (Deprecated Way)------")
    println(myPet.replaceFirstChar { it.uppercase() })

    println("------Capitalize String (Recommended Way)------")
    println(myPet.replaceFirstChar { it.uppercase() })

    println("------Decapitalize String (Recommended Way)------")
    println(myPet.replaceFirstChar { it.lowercase() })

    println("------Remove space from beginning and ending of a String------")
    val statement = "  My Name is    Sridhar    Panda    "
    println(statement)
    println(statement.trim())

    println("------Get a character using index value------")
    println("The character at index value 4 is: ${myPet[4]}")

    println("------Get substring------")
    println("The substring from index 2 is: ${myPet.substring(2)}")
    println("The substring from index 2 to 6 is (using substring()): ${myPet.substring(2,6)}")
    println("Substring from index 2 to 5 using slice(): ${myPet.slice(2..5)}")

    println("------Replace First Character------")
    println(myPet.replaceFirst('c', 'C'))
}
