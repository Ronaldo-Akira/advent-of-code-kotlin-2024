
fun main() {

    fun part1(input: List<String>): Int {
        var safeReports = 0

        fun isReportSafe(report: List<String>): Boolean {
            var safe = true
            var diff: Int
            var increasing = false
            var decreasing = false

            var currentIndex = 0
            var nextIndex = 1

            while (currentIndex < report.size-1){

                diff = report[currentIndex].toInt() - report[nextIndex].toInt()

                when (diff) {
                    in 1..3 -> {
                        safe = true
                        increasing = true
                    }
                    in -1 downTo -3 -> {
                        safe = true
                        decreasing = true
                    }
                    else -> {
                        return false
                    }
                }

                if (increasing && decreasing){
                    return false
                }
                currentIndex++
                nextIndex++
            }
            return safe

        }

        input.forEach {line ->
            if (isReportSafe(line.split(" "))) safeReports++
        }

        return safeReports
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    val input = readInput("Day02")
    part1(input).println()
//    part2(input).println()
}
