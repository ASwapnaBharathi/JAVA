import java.io.*;
import java.util.Scanner;
public class String_count{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int line=A.length()+B.length();
        System.out.println(line);    
        System.out.println(A + " "+ B);
    }

}