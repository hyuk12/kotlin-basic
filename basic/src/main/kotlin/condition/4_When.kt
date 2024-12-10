package condition

fun main() {
    // 자바 코드를 코틀린의 when 식으로 변환한 코드
    val day = 2

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        6 -> "토요일"
        7 -> "일요일"
        else -> "요일을 잘못 입력했습니다."
    }
    println(result)
    // else 를 사용하지 않아도 된다
    when(getColor()) {
        Color.RED -> println("빨간색")
        Color.GREEN -> println("초록색")
        else -> println("파란색")
    }
    // 여러개의 조건을 콤마로 구분해 한줄에서 정의 할 수 있다.
    when(getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("그 외 숫자")
    }
}

enum class Color {
    RED, GREEN, BLUE
}

fun getColor() = Color.RED

fun getNumber() = 2