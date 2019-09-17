package array

fun main() {
    readLine()
    val map = readLine()!!.split(" ").map { it.toInt() }
    println("${map.min()} ${map.max()}")
}