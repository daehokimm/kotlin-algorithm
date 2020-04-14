package sort

fun main() {
    val num = readLine()!!.toInt()
    val array = IntArray(num)
    for (x in 0 until num) {
        array[x] = readLine()!!.toInt()
    }

    array.sort()
    for (i in array) {
        println(i)
    }
}