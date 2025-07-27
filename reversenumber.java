package javapractices;
import java.util.Scanner;
public class reversenumber {
public static void main(String[]args){
    System.out.println("input to be reversed:");
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    int reverse = 0;

    while(input!=0){
        int digit = input %10;
        reverse= reverse *10+digit;
        input = input /10;
       
    }
     System.out.println("reversed value:"+reverse);
    scan.close();

   }
}

