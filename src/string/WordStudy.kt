package string

fun main() {
    val map = readLine()!!
        .toUpperCase()
        .toList()
        .groupBy(keySelector = { k -> k }, valueTransform = { v -> v })
        .mapValues { it.value.size }

    var result = ""
    var max = 0
    for (key in map.keys) {
        val value = map[key]!!
        if (value > max) {
            max = map[key]!!
            result = key.toString()
        } else if (value == max) {
            result += key.toString()
        }
    }

    if (result.length > 1)
        result = "?"

    println(result)
}