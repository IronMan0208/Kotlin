package array

fun main() {
    val number = Array(1) { (1..50).random() }
    println(number.joinToString(", "))
}