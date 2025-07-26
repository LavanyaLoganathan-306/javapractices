package javapractices;
import java.util.Scanner;

public class temperature {
    public static void main(String[]args){
        System.out.println(" --temperature conversion--");
        System.out.println("enter the celcius value:");
        Scanner scan = new Scanner(System.in);
        double celcius =  scan.nextDouble();
        System.out.println("celcius value:"+celcius+"C");
        double farhernheit = (celcius*1.8)+32;
        System.out.println("farhernheit:"+farhernheit+"F");
        scan.close();
        
    }    
}
