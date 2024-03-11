import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);
        System.out.println("String invertida: " + reversedString);
    }

    public static String reverseString(String str) {
        
        char[] charArray = str.toCharArray();
        int length = charArray.length;

     
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }

      
        return new String(charArray);
    }
}
