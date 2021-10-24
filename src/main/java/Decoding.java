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
        /////
        String decodedMessage = "";
        for(int y = 0; y< encodedText.length(); y++){
            char decodeLetters = encodedText.charAt(y);
            if(decodeLetters >= 'A' && decodeLetters <= 'Z'){
                decodeLetters = (char) (decodeLetters - decodingKey);
                if(decodeLetters < 'A'){
                    decodeLetters = (char) (decodeLetters-'A'+'Z'+1);
                }
            }
            decodedMessage = String.format("%s%s", decodedMessage, decodeLetters);

        }
        ////
        System.out.println(decodedMessage);
        return decodedMessage;
    }

    public String setEncodedText(String encodedText) {
        this.encodedText = encodedText;
        return encodedText;
    }

    public Decoding(int decodingValue, String textToDecode){
        decodingKey = decodingValue;
        encodedText = textToDecode.toUpperCase();
    }
}
