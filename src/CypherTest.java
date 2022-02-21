import org.junit.Test;
import static org.junit.Assert.*;

public class CypherTest {

    @Test
    public void cipher() {
        Cypher caesarCipher = new Cypher();

        assertEquals("jo dpef xf usvtu", caesarCipher.cipher("in code we trust", 1));
    }

    @Test
    public void testEmptyString() {
        Cypher caesarCipher = new Cypher();
        assertEquals("", caesarCipher.cipher("", 12));
    }
}