import java.util.Scanner;


public class Cypher {


    public static String cipher(String text, int shift) {
        final String alph = "abcdefghijklmnopqrstuvwxyz";
        text = text.toLowerCase();

        String cipher = "";

        for (int i = 0; i < text.length(); i++) {
            int mappingV = alph.indexOf(text.charAt(i));

            int enVal = (shift + mappingV) % 26;
            char Val = alph.charAt(enVal);
            cipher = cipher + Val;
        }
        return cipher;

    }

    public static String decrypt(String cipherText, int shift) {
        final String alph = "abcdefghijklmnopqrstuvwxyz";
        cipherText = cipherText.toLowerCase();

        String plain = "";

        for (int i = 0; i < cipherText.length(); i++) {
            int map = alph.indexOf(cipherText.charAt(i));
            int Vals = (map - shift) % 26;
            if (Vals < 0)
            {
                Vals = alph.length() + Vals;
            }
            char Val = alph.charAt(Vals);
            plain = plain + Val;
        }
        return plain;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cipheredMessage = null;
        boolean isrunning = true;
        String X = null;
        int offset = 0;
        Cypher caesarsCipher = new Cypher();


        do{
        System.out.println("Choose 1) Enter Message 2)Encrypt 3)decrypt 4)Exit");
        int Choice = sc.nextInt();
        switch (Choice) {
            case 1:
            {
                System.out.println("Message:");
                Scanner scan = new Scanner(System.in);
                X = scan.nextLine();
                offset = ciphervalue(X);
                System.out.println("Offset Value:"+offset);
                break;
            }
            case 2: {
                cipheredMessage = String.valueOf(caesarsCipher.cipher(X, offset));
                System.out.println("Ciphered message: " + cipheredMessage);
                break;
            } case 3: {
                String Decrypt = String.valueOf(caesarsCipher.decrypt(cipheredMessage, offset));
                System.out.println("Offset Value:"+ offset);
                System.out.println("DE message: " + Decrypt);
                break;
            } case 4:{
                System.out.println("Thank you, goodbye!");
                isrunning = false;
                break;
            }
        }
    }while(isrunning);}

    public static int ciphervalue(String Message){

        int sum=0;
        for(int i=0; i<Message.length(); i++)
        {
            int asciiValue = Message.charAt(i);
            sum = sum+ asciiValue;

        }

        return sum;
    }
}