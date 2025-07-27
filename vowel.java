package javapractices;

import java.util.Scanner;
public class vowel {
    public static void main(String[]args){
        System.out.println("enter the char:");
        Scanner scan = new Scanner(System.in);
        char ch =  scan.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u'){
            System.out.println("vowel");
        }else if(ch >='a' && ch<='z'){
            System.out.println("consonants");
        }
        else {
            System.out.println("enter the valid alphabet");
        }

    }
    
}
