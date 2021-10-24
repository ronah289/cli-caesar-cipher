public class Encoding {
    private int key;
    private String input;

    public Encoding(int newKey,String newInput){
        key = newKey;
        input = newInput;
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
        if(input.matches("[a-zA-Z]+")){
            checkInput = input;
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
