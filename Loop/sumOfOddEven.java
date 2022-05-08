import java.util.*;

class sumOfOddEven{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n = sc.nextInt();
        n=n/2;
        int a = n+1;
        int even = n*a;
        int odd = n*n;
        
        System.out.println("Sum of even numbers:"+ even);
        System.out.println("Sum of odd numbers:"+ odd);
    }
}