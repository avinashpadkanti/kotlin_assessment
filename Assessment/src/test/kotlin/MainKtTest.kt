import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MainKtTest{
    @Test
    fun testMainHappyPath(){
        assertEquals(1.0666666666666667, calculateTotal(arrayOf("apple", "apple", "orange", "apple")))
    }

    @Test
    fun testMainCaps(){
        assertEquals(1.0666666666666667, calculateTotal(arrayOf("APPLE", "APPLE", "ORANGE", "APPLE")))
    }

    @Test
    fun testMainWhiteSpaces(){
        assertEquals(1.0666666666666667, calculateTotal(arrayOf("  APPLE   ", "APPLE   ", "ORANGE   ", "APPLE    ")))
    }

    @Test
    fun testMain_4_Apples(){
        assertEquals(1.3666666666666667, calculateTotal(arrayOf("apple", "apple", "orange", "apple", "apple")))
    }

    @Test
    fun testMain_6_Oranges(){
        assertEquals(2.2, calculateTotal(arrayOf("apple", "apple", "orange", "apple", "apple", "orange", "orange", "orange", "orange", "orange")))
    }
}
