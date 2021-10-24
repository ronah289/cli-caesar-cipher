public class Decoding {
    private int decodingKey;
    private String encodedText;

    public int getDecodingKey() {
        return decodingKey;
    }

    public int setDecodingKey(int decodingKey) {
        this.decodingKey = decodingKey;
        return decodingKey;
    }

    public String getEncodedText() {
        return encodedText;
    }

    public String setEncodedText(String encodedText) {
        this.encodedText = encodedText;
        return encodedText;
    }

    public Decoding(int decodingValue, String textToDecode){
        decodingKey = decodingValue;
        encodedText = textToDecode;
    }
}
