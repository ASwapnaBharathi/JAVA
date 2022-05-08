import java.util.*;

public class sumOfCubes{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        int cube = 0;
        while(n!=0){
        int remainder=n%10;
        cube=cube+remainder*remainder*remainder;
        n=n/10;
        }
        if(cube == n){
            System.out.println(n+" Hi! Janu");
        }else{
            System.out.println(n+ " Bye Janu");
        }
    
    }
}