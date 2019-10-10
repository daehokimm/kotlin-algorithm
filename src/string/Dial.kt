package string

/*
5622
 */
fun main() {
    val sum = readLine()!!.map { c -> dial(c) }.sum()
    print(sum)
}

fun dial(c: Char) : Int {
    return when(c) {
        'A', 'B', 'C' -> 3
        'D', 'E', 'F' -> 4
        'G', 'H', 'I' -> 5
        'J', 'K', 'L' -> 6
        'M', 'N', 'O' -> 7
        'P', 'Q', 'R', 'S' -> 8
        'T', 'U', 'V' -> 9
        'W', 'X', 'Y', 'Z' -> 10
        else -> 0
    }
}