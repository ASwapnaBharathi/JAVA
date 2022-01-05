import java.util.Scanner;
public class Split_method{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String sentence=sc.nextLine();
        String[] word=sentence.Split(' ');
        foreach (var sub in sentence){
        System.out.println(sub);
        }
    }
}