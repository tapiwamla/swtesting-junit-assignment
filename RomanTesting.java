import org.junit.*;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    // The class being tested is RomanNumeral.java.
    // The method being tested is romanToInt(String s).
    // The first three tests were written by the Instructor, DR. EUNICE MWANGI.


    // CASE #1: ONLY ONE LETTER
    @Test
    public void singleDigit() {
        Assertions.assertEquals(1, new RomanNumeral().romanToInt("I"));
        Assertions.assertEquals(5, new RomanNumeral().romanToInt("V"));
        Assertions.assertEquals(10, new RomanNumeral().romanToInt("X"));
        Assertions.assertEquals(50, new RomanNumeral().romanToInt("L"));
        Assertions.assertEquals(100, new RomanNumeral().romanToInt("C"));
        Assertions.assertEquals(500, new RomanNumeral().romanToInt("D"));
        Assertions.assertEquals(1000, new RomanNumeral().romanToInt("M"));
    }

    // CASE #2: REPETITION
    @Test
    public void repetition() {
        Assertions.assertEquals(2, new RomanNumeral().romanToInt("II"));
        Assertions.assertEquals(20, new RomanNumeral().romanToInt("XX"));
    }

    // CASE #3: MANY LETTERS IN ORDER
    @Test
    public void manyLettersInOrder() {
        Assertions.assertEquals(6, new RomanNumeral().romanToInt("VI"));
        Assertions.assertEquals(15, new RomanNumeral().romanToInt("XV"));
        Assertions.assertEquals(60, new RomanNumeral().romanToInt("LX"));
    }


    // The remaining tests were written by the student, MR. TAPIWANASHE MLAMBO.
    // CASE #4: NULL
    @Test
    public void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> new RomanNumeral().romanToInt(null));
    }

    // CASE #5: INVALID AND VALID LETTER
    @Test
    public void invalidAndValidLetter() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new RomanNumeral().romanToInt("XIZ"));
    }

    // CASE #6: NOT VALID
    @Test
    public void inValidLetter() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new RomanNumeral().romanToInt("Z"));
    }

    // CASE #7: SUBTRACTIVE NOTATION
    @Test
    public void testSubtractiveNotation() {
        Assertions.assertEquals(4, new RomanNumeral().romanToInt("IV"));
    }

    // CASE #8: WITH AND WITHOUT SUBTRACTIVE NOTATION
    @Test
    public void testWithAndWithoutSN() {
        Assertions.assertEquals(14, new RomanNumeral().romanToInt("XIV"));
    }

    // CASE #9: FIRST NUMBER IS I
    @Test
    public void testFirstNumberI() {
        Assertions.assertEquals(1, new RomanNumeral().romanToInt("I"));
    }

}
