import java.util.Scanner;
public class Check{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word:");
        String word=sc.nextLine();
        System.out.print("Check starting letter:");
        String start=sc.nextLine();
        System.out.println(word.startsWith(start));
        System.out.print("Enter a Ending letter:");
        String end=sc.nextLine();
        System.out.print(word.endsWith(end));

    }
}