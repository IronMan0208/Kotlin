package array

fun main() {
    val arr = Array(10) { 0 }
    println(arr.joinToString(", "))

    val mul = Array(11) { i -> i * 3 }
    println(mul.joinToString(", "))
}