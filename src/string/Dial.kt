package string

/*
5622
 */
fun main() {
    print("${readLine()!!.map { c -> dial(c) }.sum()}")
}

fun dial(c: Char) : Int {
    return when {
        c < 'P' -> 3 + (c - 'A') / 3
        c < 'T' -> 8
        c < 'W' -> 9
        else -> 10
    }
}