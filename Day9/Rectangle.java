import java.util.Scanner;
import java.io.*;
public class Rectangle{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows=scan.nextInt();
        System.out.print("Enter number of columns:");
        int columns=scan.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}