import java.util.Scanner;
import java.io.*;

public class Cases{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        int num=sc.nextInt();
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.substring(0,num).toUpperCase()+word.substring(num).toLowerCase());
        System.out.println(word.substring(0,num).toLowerCase()+word.substring(num).toUpperCase());
    }
}