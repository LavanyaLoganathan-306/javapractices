package javapractices;
import java.util.Scanner;
public class ASCII {
    public static void main(String[]args){
        System.out.println("enter the value :");
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        int ascii = (int)ch;
       System.out.println("your char:" +ch);
       System.out.println("ASCII VALUE:"+ascii);
       
    }
    
}
