package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {

    @Test
    public void testHappyGs() {
        GHappy gh = new GHappy();
        assertTrue(gh.gHappy("xxggxx"));  // Caso donde 'g' está correctamente emparejada
    }

    @Test
    public void testSingleG() {
        GHappy gh = new GHappy();
        assertFalse(gh.gHappy("xxgxx"));  // Caso donde hay una 'g' solitaria
    }

    @Test
    public void testAllGsHappy() {
        GHappy gh = new GHappy();
        assertTrue(gh.gHappy("gggg"));  // Caso donde todas las 'g' están emparejadas
    }

    @Test
    public void testOnlyOneG() {
        GHappy gh = new GHappy();
        assertFalse(gh.gHappy("g"));  // Solo una 'g', debe retornar falso
    }

    @Test
    public void testEmptyString() {
        GHappy gh = new GHappy();
        assertFalse(gh.gHappy(""));  // Cadena vacía, no hay 'g'
    }

    @Test
    public void testNoGs() {
        GHappy gh = new GHappy();
        assertFalse(gh.gHappy("abcdef"));  // No hay 'g', debe ser falso
    }

    @Test
    public void testGsAtStartAndEnd() {
        GHappy gh = new GHappy();
        assertFalse(gh.gHappy("gabcdefg"));  // 'g' solitarias al inicio y final
    }

    @Test
    public void testMixedGs() {
        GHappy gh = new GHappy();
        assertFalse(gh.gHappy("ggxgxgg"));  // Hay una 'g' solitaria en el medio
    }
}
