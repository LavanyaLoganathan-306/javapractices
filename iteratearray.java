package javapractices;
import java.util.Scanner;
public class iteratearray{
    public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     int[]numbers = new int[5];
     int position =0;
     while (position<5){
        numbers[position] = scan.nextInt();
        position++;
     }   
     int largestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
        
                largestNumber = numbers[i];
            }
            

    }
    System.out.println("The largest number is: " + largestNumber);
    
}
}
