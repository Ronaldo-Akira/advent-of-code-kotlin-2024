import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {

        val left = mutableListOf<Int>()
        val right =  mutableListOf<Int>()

        input.forEach {
            val line = it.split("\\s+".toRegex())
            left.add(line[0].toInt())
            right.add(line[1].toInt())
        }

        val leftSorted = left.sorted()
        val rightSorted = right.sorted()

        val pairs: List<Pair<Int, Int>> = leftSorted.zip(rightSorted)

        var sum = 0
        pairs.forEach {pair ->
            sum += abs(pair.first - pair.second)
        }

        return sum
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("Day01")
    part1(input).println()
//    part2(input).println()
}
