import java.util.Scanner;
public class Trim_method{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a word with spaces:");
    String sentence=scan.nextLine();
    System.out.println(sentence.trim());
    }
}