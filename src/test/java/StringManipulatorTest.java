import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    // We create a private instance of StringManipulator, 
    // as we only need it within this class
    private StringManipulator stringManipulator;

    // Here we initialize this instance before each Test.
    // We do so to guarantee a fresh instance of the class for each test.
    // By doing this, we prevent the tests interfering with each other.
    @BeforeEach
    public void setUp() {
        stringManipulator = new StringManipulator();
    }

    @Test
    public void testToUpperCase() {
        assertEquals("I DONT KNOW THE ANSWER TO THAT", stringManipulator.toUpperCase("I dont know the answer to that"));
    }

    @Test
    public void testToLowerCase() {
        assertEquals("garden marauders marauding cabbages", stringManipulator.toLowerCase("GARDEN MARAUDERS MARAUDING CABBAGES"));
    }

    @Test
    public void testReverse() {
        assertEquals("slleB elgniJ", stringManipulator.reverse("Jingle Bells"));
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(3, stringManipulator.countOccurrences("I wonder why, I wonder how", 'o'));
    }
    
    // Here we test whether the countOccurrences() method throws an 
    // illegalArgumentException when we input null as an argument
    @Test
    public void testCountOccurrencesThrowsExceptionOnNullInput() {
        assertThrows(IllegalArgumentException.class, () -> stringManipulator.countOccurrences(null, 'a'));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(stringManipulator.isPalindrome("Nur du Gudrun"));
        assertFalse(stringManipulator.isPalindrome("ayy macarena"));
    }

    @Test
    public void testRemoveWhitespaces() {
        assertEquals("Whyhaveyouforsakenme?", stringManipulator.removeWhitespaces("Why have you forsaken me?"));
    }


}
