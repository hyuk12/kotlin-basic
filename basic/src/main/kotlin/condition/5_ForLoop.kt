package condition

fun main() {
    // 범위 연산자 .. 를 사용해서 for loop 돌리기
//    for (i in 0..3) {
//        println(i)
//    }

    // until 을 사용해 반복
    // 뒤에 온 숫자는 포함하지 않는다

//    for (i in 0 until 3) {
//        println(i)
//    }

    // step 에 들어온 값 만큼 증가 시킨다
//    for (i in 0..10 step 2) {
//        println(i)
//    }

    // downTo 를 사용해 역순으로 반복
//    for (i in 10 downTo 0 step 2) {
//        println(i)
//    }

//    // 전달받은 배열을 반복
//    val numbers = arrayOf(1, 2, 3, 4, 5)
//    for (i in numbers) {
//        println(i)
//    }
//
//    // 옛날 방식
//    val names = listOf("John", "Smith", "Alex")
//    for (i in 0..<names.size) {
//        val name = names[i]
//        println("[$i] $name")
//    }
//
//    for (i in names.indices) {
//        val name = names[i]
//        println("[$i] $name")
//    }
//
//    for ((i, name) in numbers.withIndex()) {
//        println("$i $name")
//    }
//
//    names.forEachIndexed { i, name ->
//        println("$i $name")
//    }

    val capitals = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
        "Ukraine" to "Kiev",
    )

    for (entry in capitals.entries) {
        println(
            "The capital of ${entry.key} is ${entry.value}"
        )
    }

    for ((country, capital) in capitals) {
        println("The capital of ${country} is ${capital}")
    }

    capitals.forEach { (country, capital) ->
        println("The capital of $country is $capital")
    }
}