package variable

var x = 5 // 전역 변수 (탑 레벨)

fun main() {
    // val = value
    // var = variable
    x += 1
    println(x)
    val a : Int = 1
    val b = 1 // 타입 추론 가능

    // a = 2 // val은 변경 불가능

    // 지연 할당(타입을 꼭 명시해야함)
    val c: Int
    c = 3

    // 변수
    var d : String = "Hello"
    d = "World"

    // 변수의 타입 변경 불가능
    var e = "Hello"
    // e = 1 // Error

}