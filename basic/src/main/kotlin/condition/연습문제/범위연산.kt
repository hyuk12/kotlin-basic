package condition.연습문제

fun calculateSumOfSquares(n: Int): Int  {
    var sum = 0
    for (value in 1..n) {
        sum += value * value
    }
    return sum
}

fun calculateSumOfEven(n: Int): Int {
    var sum = 0
    for (value in 2.. n step 2) {
        sum += value
    }
    return sum
}

fun countDownByStep(
    start: Int,
    end: Int,
    step: Int,
): String {
    var result = ""
    for (value in start downTo end step step) {
        result += value
        if (value != end) {
            result += ", "
        }
    }
    return result
}

fun main() {

}