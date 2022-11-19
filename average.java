import java.util.*;
public class average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter a Third Number");
        int c = sc.nextInt();
        System.out.print("The average value is " + average(a,b,c)+"\n");
        
    }
    public static int average(int a, int b, int c){
        return(a+b+c)/3;
        
    }
    
}
