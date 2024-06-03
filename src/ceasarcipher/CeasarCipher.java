
package ceasarcipher;

import java.util.*;

public class CeasarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Encypt - 1");
        System.out.println("Decrypt - 2");
        System.out.print("Enter Action: ");
        int Action = scan.nextInt();
        if (Action == 1){
            System.out.print("Enter Message: ");
            scan.nextLine();
            String encryptMes = scan.nextLine().toUpperCase();
            System.out.print("Enter Encryption Shift: ");
            int shift = scan.nextInt();
            System.out.println("Encrypted Message: " + Encrypt(encryptMes,shift));
        }
        else if (Action == 2){
            System.out.print("Enter Encrypted Message: ");
            scan.nextLine();
            String encryptMes = scan.nextLine().toUpperCase();
            System.out.print("Enter Decryption Shift: ");
            int shift = scan.nextInt();
            System.out.println("Decrypted Message: " + Decrypt(encryptMes,shift));
        }
    }
    public static String Decrypt(String message, int shift){

        String result = "";
        char[] Alphabet = {'A','B','C','D','E','F','G','H',
            'I','J','K','L','M','N','O','P','Q',
            'R','S','T','U','V','W','X','Y','Z'};
        for (char c : message.toCharArray()){
            if (c == ' '){
               result += " ";
               continue;
            }
            int index = 0;
            for (int i = 0; i < Alphabet.length; i++){
               if (Alphabet[i] == c) index = i;
            }
        int letterIndex = (index - shift) % 26;
        if (letterIndex > 25) letterIndex -= 25;
        if (letterIndex < 0) letterIndex += 26;
        result += Alphabet[letterIndex];
        }
        return result;
    }
    public static String Encrypt(String message, int shift){

        String result = "";
        char[] Alphabet = {'A','B','C','D','E','F','G','H',
            'I','J','K','L','M','N','O','P','Q',
            'R','S','T','U','V','W','X','Y','Z'};
        for (char c : message.toCharArray()){
            if (c == ' '){
                result += " ";
                continue;
            }
            int index = 0;
            for (int i = 0; i < Alphabet.length; i++){
                if (Alphabet[i] == c) index = i;
            }
            int letterIndex = (index + shift) % 26;
            if (letterIndex > 25) letterIndex -= 25;
            if (letterIndex < 0) letterIndex += 26;
            result += Alphabet[letterIndex];
        }
        return result;
    }
    
}
