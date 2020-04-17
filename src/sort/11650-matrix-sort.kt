package sort

fun main() {
    val num = readLine()!!.toInt()
    val points = arrayListOf<Point>()
    for (x in 0 until num) {
        val list = readLine()!!.split(" ").toList()
        points.add(Point(list[0].toInt(), list[1].toInt()))
    }
    points.sortWith(kotlin.Comparator(Point::compareWith))
    for (p in points) {
        println("${p.x} ${p.y}")
    }
}

data class Point(
        val x: Int,
        val y: Int
) {
    fun compareWith(other: Point): Int {
        return when {
            this.x > other.x -> 1
            this.x < other.x -> -1
            this.x == other.x && this.y > other.y -> 1
            this.x == other.x && this.y < other.y -> -1
            else -> 0 // Never!
        }
    }
}