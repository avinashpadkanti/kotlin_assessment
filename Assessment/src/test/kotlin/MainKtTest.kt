import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MainKtTest{
    @Test
    fun testMainHappyPath(){
        assertEquals(2.05, calculateTotal(arrayOf("apple", "apple", "orange", "apple")))
    }

    @Test
    fun testMainCaps(){
        assertEquals(2.05, calculateTotal(arrayOf("APPLE", "APPLE", "ORANGE", "APPLE")))
    }

    @Test
    fun testMainWhiteSpaces(){
        assertEquals(2.05, calculateTotal(arrayOf("  APPLE   ", "APPLE   ", "ORANGE   ", "APPLE    ")))
    }
}
