public class Encoding {
    private int key;
    private String input;

    public Encoding(int newKey,String newInput){
        key = newKey;
        input = newInput.toUpperCase();
    }

    public int getKey() {
        return key;
    }

    public int setKey(int key) {
        this.key = key;
        return key;
    }

    public String getInput() {
        String encodedText = "";
        char individualLetters;
        for(int x = 0; x < input.length(); x++){
            individualLetters = input.charAt(x);
            if(individualLetters >= 'A' && individualLetters <= 'Z'){
                individualLetters = (char) (individualLetters + key);
                if(individualLetters > 'Z'){
                    individualLetters = (char) (individualLetters+'A'-'Z'-1);
                }
            }
            encodedText = String.format("%s%s", encodedText, individualLetters);
        }
        return encodedText;
    }

    public String setInput(String input) {
        this.input = input;
        return input;
    }
}
