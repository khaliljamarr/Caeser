package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cipher text: ");
        String ciphertxt = keyboard.nextLine();
        String decrypt = "";
        for(int i=0; i < ciphertxt.length();i++)

        {
            char letters = ciphertxt.charAt(i);
            if(letters >= 'a' && letters <= 'z')
            {
                letters = (char) (letters + 1);

                if(letters < 'a') {
                    letters = (char) (letters -'a'+'z'+1);
                }
                decrypt = decrypt + letters;
            }
            else if(letters >= 'A' && letters <= 'Z')
            {
                letters = (char) (letters + 1);

                if (letters < 'A') {
                    letters = (char) (letters -'A'+'Z'+1);
                }
                decrypt = decrypt + letters;
            }
            else
            {
                decrypt = decrypt + letters;
            }
        }
        System.out.println("Message: " + decrypt);
    }
}