import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {
    Encoding testValues = new Encoding(2,"abcd");

    @Test
    void getKey() {
        assertEquals(2,testValues.getKey());
    }

    @Test
    void setKey() {
        assertEquals(2,testValues.setKey(testValues.getKey()));
    }

    @Test
    void getInput() {
        assertEquals("abcd",testValues.getInput());
    }

    @Test
    void setInput() {
        assertEquals("abcd",testValues.setInput(testValues.getInput()));
    }
}