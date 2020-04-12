package bruteforce

fun main() {
    val num = readLine()!!.toInt()
    val people = arrayListOf<Person>()
    while (people.size < num) {
        val split = readLine()!!.split(" ")
        people.add(Person(split[0].toInt(), split[1].toInt()))
    }

    for ((index, p: Person) in people.withIndex()) {
        for (offset in index until people.size) {
            p.compareWith(people[offset])
        }
        print(p.rank)
        if (index != (people.size - 1)) {
            print(" ")
        }
    }
}

data class Person(
        val weight: Int,
        val height: Int,
        var rank: Int = 1
) {

    fun compareWith(other: Person) {
        if (this.height > other.height && this.weight > other.weight) {
            other.rank = other.rank + 1
        } else if (this.height < other.height && this.weight < other.weight) {
            this.rank++
        }
    }
}