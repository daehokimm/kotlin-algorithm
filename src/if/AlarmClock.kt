package `if`

/**
 * 2884
 */
fun main() {
    var (hour, minute) = readLine()!!.split(" ").map { it.toInt() }
    minute -= 45

    if (minute < 0) {
        minute += 60
        hour--
    }

    if (hour < 0)
        hour += 24

    println("$hour $minute")
}