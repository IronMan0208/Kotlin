package array

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (element in arr) {
        print(" $element")
    }
    println()
    val arr2 = arrayOf<Int>(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    for (element in arr2) {
        print(" $element")
    }
}