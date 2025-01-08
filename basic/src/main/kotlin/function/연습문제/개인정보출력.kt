package function.연습문제

fun formatPersonDisplay(
    name: String? = null,
    surname: String? = null,
    age: Int? = null,
): String {
    return if (name == null && surname == null && age == null) {
        ""
    } else if (name == null) {
        "$surname ($age)"
    } else if (surname == null) {
        "$name ($age)"
    } else if (age == null) {
        "$name $surname"
    } else {
        "$name $surname ($age)"
    }
}

fun formatPersonDisplayAnswer(
    name: String? = null,
    surname: String? = null,
    age: Int? = null,
): String {
    var result = ""
    if (name != null) {
        result += name
    }
    if (surname != null) {
        result += " $surname"
    }
    if (age != null) {
        result += " ($age)"
    }
    return result.trim()
}

fun main() {
    println(formatPersonDisplayAnswer("John", "Smith", 42))
    println(formatPersonDisplayAnswer("Alex", "Simonson"))
    println(formatPersonDisplayAnswer("Peter", age = 25))
    println(formatPersonDisplayAnswer(surname = "Johnson", age = 18))
}