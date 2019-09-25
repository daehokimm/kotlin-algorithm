package string

fun main() {
    val alphabet = IntArray(26) {0}

    readLine()!!
        .toUpperCase()
        .forEach { alphabet[it - 'A']++ }

    val indexOfFirst = alphabet.indexOfFirst { it == alphabet.max() }
    val indexOfLast = alphabet.indexOfLast { it == alphabet.max() }

    println("${if (indexOfFirst != indexOfLast) "?" else ('A' + indexOfFirst)}")
}