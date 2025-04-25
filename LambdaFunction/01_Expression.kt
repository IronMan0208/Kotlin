package LambdaFunction

fun main() {
    val sum = { a: Int, b: Int -> a + b }
    print(sum(7, 3))
}