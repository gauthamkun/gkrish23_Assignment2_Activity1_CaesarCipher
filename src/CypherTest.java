import org.junit.Test;
import static org.junit.Assert.*;

public class CypherTest {

    @Test
    public void testcipher() {
        Cypher caesarCipher = new Cypher();

        assertEquals("nkrru", caesarCipher.cipher("Hello", 500));
    }
    public void testciphernotNull() {
        Cypher caesarCipher = new Cypher();
        assertNotNull("", caesarCipher.cipher("Hello", 500));
    }
    @Test
    public void testEmptyString() {
        Cypher caesarCipher = new Cypher();
        assertEquals("", caesarCipher.cipher("", 12));
    }


    @Test
    public void testciphervalue() {
        Cypher caesarCipher = new Cypher();
        assertEquals(500,caesarCipher.ciphervalue("Hello"));
    }


    @Test
    public void testDecrypt() {
        Cypher caesarCipher = new Cypher();
        assertEquals("hello", caesarCipher.decrypt("nkrru", 500));
    }
    @Test
    public void testDecryptnotNull() {
        Cypher caesarCipher = new Cypher();
        assertNotNull("", caesarCipher.decrypt("nkrru", 1));
    }
}