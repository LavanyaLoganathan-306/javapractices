package javapractices;
public class swappingvar {
    public static void main(String[]args){

        int a = 30;
        int b = 17;
        System.out.println("values before swapping : A ="+a);
        System.out.println("values before swapping : B ="+b);
         a = a+b;
         b = a-b;
         a = a-b;
         System.out.println("values after swaping : A = "+a);
         System.out.println("B="+b);

    }


}
