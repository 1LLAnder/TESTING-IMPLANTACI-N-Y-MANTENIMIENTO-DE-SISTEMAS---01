package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void testBasicShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("khoor", cipher.encrypt("hello", 3));  // "hello" con shift de 3 → "khoor"
    }

    @Test
    public void testShiftOne() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("bcd", cipher.encrypt("abc", 1));  // "abc" con shift de 1 → "bcd"
    }

    @Test
    public void testShiftWrapAround() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("zab", cipher.encrypt("xyz", 2));  // "xyz" con shift de 2 → "zab"
    }

    @Test
    public void testNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.encrypt("abc", -3));  // "abc" con shift -3 → "xyz"
    }

    @Test
    public void testNoShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("hello", cipher.encrypt("hello", 0));  // Sin cambio
    }

    @Test
    public void testFullCycleShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("hello", cipher.encrypt("hello", 26));  // Shift de 26 (mismo alfabeto) → Igual
    }

    @Test
    public void testEmptyMessage() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.encrypt("", 5));  // Mensaje vacío → "invalid"
    }

    @Test
    public void testInvalidCharacters() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.encrypt("hello!", 2));  // Caracter especial → "invalid"
    }

    @Test
    public void testMessageWithSpaces() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.encrypt("hello world", 3));  // Espacios no permitidos → "invalid"
    }
}
