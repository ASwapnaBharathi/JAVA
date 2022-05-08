import java.util.*;

class ReverseNumber{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int reverse = 0;
        for(int n = sc.nextInt();n!=0;n=n/10){
            int remainder=n%10;
            reverse = reverse*10+remainder;

        }System.out.println(reverse);

        


    }
}