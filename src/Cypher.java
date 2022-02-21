import java.util.Scanner;


public class Cypher {
    private static final char LETTER_A = 'a';
    private static final char LETTER_Z = 'z';
    private static final int ALPHABET_SIZE = 26;


    public String cipher(String message, int offset) {
        offset %= ALPHABET_SIZE;
        char[] character = message.toCharArray();
        offsetBy(character, offset);
        return new String(character);
    }

    public void offsetBy(char[] character, int offset) {
        for (int i = 0; i < character.length; ++i) {
            if (character[i] != ' ') {
                character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
            }
        }
    }

    public static char offsetChar(char c, int offset, char letterA, char letterZ) {
        c += offset;
        if (c < letterA) {
            return (char) (c + ALPHABET_SIZE);
        }
        if (c > letterZ) {
            return (char) (c - ALPHABET_SIZE);
        }
        return c;
    }
    public static void main(String[] args) {



        System.out.println("Message:");
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        int offset = ciphervalue(message);

        Cypher caesarsCipher = new Cypher();
        String cipheredMessage = caesarsCipher.cipher(message, offset);
        System.out.println("Message: " + message);
        System.out.println("Offset: " + offset);
        System.out.println("Ciphered message: " + cipheredMessage);
    }

}