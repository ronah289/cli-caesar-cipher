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
        String checkInput = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if(input.matches("[A-Z ]+")){
//            checkInput = input;
            char outputValues = ' ';
            for(int x = 0;x< input.length();x++){
                if(input.charAt(x) >='A' && input.charAt(x)<='Z'){
                    outputValues = alphabet.charAt((x+key)%26);
                }
                checkInput = checkInput+ outputValues;
            }

        }
        else {
            checkInput = "check your string";
        }
        return checkInput;
    }

    public String setInput(String input) {
        this.input = input;
        return input;
    }
}
