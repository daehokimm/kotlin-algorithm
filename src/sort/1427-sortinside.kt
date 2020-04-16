package sort

fun main() {
    val sortedDescending = readLine()!!.split("")
            .sortedDescending()
            .joinToString("")
    print(sortedDescending)
}