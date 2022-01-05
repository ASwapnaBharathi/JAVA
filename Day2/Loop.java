import java.util.*;
import java.io.*;
public class Loop{
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 't' value:");
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("Enter 'a' value:");
            Double a = scan.nextDouble();
            System.out.print("Enter 'b' value:");
            int b = scan.nextInt();
            System.out.print("Enter 'n' value:");
            int n = scan.nextInt();
            Double count = a;
            for(int j=0;j<n;j++)
            {
                count=count+(Math.pow(2,j)*b);
                System.out.print(count+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}