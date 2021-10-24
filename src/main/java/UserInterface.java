import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args){
        Scanner inputs =new Scanner(System.in);
        System.out.println("Caesar Cipher\n");
        System.out.println("Enter your message\n");
        String inputText = inputs.nextLine();
        System.out.println("Enter your key");
        int keyValue = inputs.nextInt();
        Encoding calculateEncoding = new Encoding(keyValue,inputText);
        Decoding calculateOutput = new Decoding(calculateEncoding.getKey(),calculateEncoding.getInput());
        System.out.println("Input String: "+inputText.toUpperCase());
        System.out.println("Encrypted String: "+calculateEncoding.getInput());
        System.out.println("Decrypted String: "+calculateOutput.getEncodedText());
    }

}