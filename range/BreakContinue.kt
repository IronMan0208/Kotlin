package range

fun main() {
    for (num in 5..15) {
        if (num == 10) {
            break
        }
        println(num)
    }
}