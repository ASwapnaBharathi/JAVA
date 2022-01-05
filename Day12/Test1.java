import java.util.Scanner;
import java.io.*;

public class Test1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a Sentence:");
        String Sentence=scan.nextLine();
        String[] words = Sentence.split(" "); 
        for (String split : words)
            System.out.println(split);
    }
}