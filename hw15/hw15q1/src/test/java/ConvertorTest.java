import main.Convertor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ConvertorTest {
    @Test
    public void testWrite() {
        assertEquals(128, Convertor.convertor("+128"));
        assertEquals(-56, Convertor.convertor("-56"));
        assertEquals(7988, Convertor.convertor("+7988"));
    }

    @Test
    public void testWrong() {
        try {
            Convertor.convertor("+54378256");
            Convertor.convertor("-7654378256");
            fail("An error expected");
        } catch (OutOfMemoryError e) {
            assertEquals("between -32767 and 32767", e.getMessage());
        }
    }

    @Test
    public void testWrongFormat() {
        try {
            Convertor.convertor("5 437@2__ 56");
            fail("An error expected");
        } catch (NumberFormatException e) {
            assertEquals("only numbers not alphabet", e.getMessage());
        }
    }

    @Test
    public void testNullFormat() {
        try {
            Convertor.convertor(null);
            fail("An error expected");
        } catch (NumberFormatException e) {
            assertEquals("null!", e.getMessage());
        }
    }
}
