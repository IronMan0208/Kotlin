package range

fun main() {
    val num = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val targetValue = 50
    if (targetValue in num) {
        print("$targetValue It exists!  ")
    } else {
        print("$targetValue It does not exist.")
    }
}