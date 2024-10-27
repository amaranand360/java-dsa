/*
Problem statement:
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules:

1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.
*/

import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        
        char inputChar = scanner.next().charAt(0);

        int result = classifyCharacter(inputChar);
        System.out.println(result);
    }

    static int classifyCharacter(char ch) {
        if(ch >= 'A' && ch <= 'Z'){
            return 1;
        } else if(ch >= 'a' && ch <= 'z'){
            return 0;
        } else {
            return -1;
        }
    }
}
