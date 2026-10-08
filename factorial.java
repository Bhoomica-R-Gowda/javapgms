import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=input.nextInt();
        System.out.println("Factorial = "+fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int n1=fact(n-1);
        return n*n1;
    }
    
}
