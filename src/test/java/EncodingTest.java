import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {
    Encoding testValues = new Encoding(2,"the");

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
        assertEquals("VJG",testValues.getInput());
    }

    @Test
    void setInput() {
        assertEquals("VJG",testValues.setInput(testValues.getInput()));
    }
}