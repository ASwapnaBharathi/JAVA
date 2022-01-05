import java.uti.Scanner;
import java.io.*;

public class Test1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a Sentence:");
        String Sentence=scan.next();
        String[] arrOfStr = Sentence.str.split(" ");
 
        for (String a : arrOfStr)
            System.out.println(a);
    }
}