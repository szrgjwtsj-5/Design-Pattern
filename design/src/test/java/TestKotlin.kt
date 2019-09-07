import org.junit.Test

class TestKotlin {

    @Test
    fun getNum() {
        val s = "MemTotal:        9858144 kB"

        val numIdx = s.find { it.isDigit() }?.let { s.indexOf(it) } ?: 0

        val sub = s.substring(numIdx)

        val res = s.filter { it.isDigit() }

        println(res)
    }
}