import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args){
        Scanner inputs =new Scanner(System.in);
        System.out.println("Caesar Cipher\n");
        System.out.println("Enter your message\n");
        String inputText = inputs.nextLine();
        System.out.println("Enter your key");
        Integer keyValue = inputs.nextInt();
        Encoding calculateEncoding = new Encoding(keyValue,inputText);
        Decoding calculateOutput = new Decoding(calculateEncoding.getKey(),calculateEncoding.getInput());
        System.out.println("INPUT:\t"+inputText.toUpperCase());
        System.out.println("ENCODED TEXT:\t"+calculateEncoding.getInput());
        System.out.println("Decoded:"+calculateOutput.getEncodedText());
//        System.out.println();
//        System.out.println(keyValue);
    }

}