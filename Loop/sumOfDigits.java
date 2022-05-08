import java.util.*;

class sumOfDigits{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;
        while(n!=0){
        int remainder=n%10;
        sum=sum+remainder;
        n=n/10;
        }System.out.println(sum);

    
    }
}