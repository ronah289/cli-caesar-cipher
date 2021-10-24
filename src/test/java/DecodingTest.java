import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {
    Decoding testDecoding = new Decoding(3,"xyz");
    @Test
    void getDecodingKey() {
        assertEquals(3,testDecoding.getDecodingKey());
    }

    @Test
    void setDecodingKey() {
        assertEquals(3,testDecoding.setDecodingKey(testDecoding.getDecodingKey()));
    }

    @Test
    void getEncodedText() {
        assertEquals("xyz",testDecoding.getEncodedText());
    }

    @Test
    void setEncodedText() {
        assertEquals("xyz",testDecoding.setEncodedText(testDecoding.getEncodedText()));
    }
}