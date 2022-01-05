import java.util.Scanner;
public class Indexing{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a line:");
        String line = scan.nextLine();
        System.out.print("Enter index value:");
        int num=scan.nextInt();
        System.out.println(line.charAt(num)); //character at mentioned index value
        System.out.println("Unicode of given indexed value: " +line.codePointAt(num)); //unicode of specified character
        System.out.println("Unicode for before mentioned index: " +line.codePointBefore(num));//Unicode  for before character of mentioned index
        System.out.print("Enter start value:");
        int start=scan.nextInt();
        System.out.print("Enter end value:");
        int end =scan.nextInt();
        System.out.println("Number of unicode: " + line.codePointCount(start,end));
        System.out.print("Enter a word from the above sentence:");
        String word=scan.next();
        System.out.println("The index of "+ "word: "+ line.indexOf(word));
        // System.out.println("The lastindex of "+ "word: "+ line.lastIndexOf(word));
    }
}