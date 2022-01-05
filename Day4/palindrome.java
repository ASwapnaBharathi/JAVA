import java.util.Scanner;
public class Palindrome{
public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    String str = scan.nextLine();
    System.out.println("original string: " +str);
    String revstr = (new StringBuffer(str)).reverse().toString();
    System.out.println("eversed string: "+ revstr);
    if(str.equalsIgnoreCase(revstr)){
        System.out.println("Palindrome!");
        }else{
            System.out.println("Not a palindrome!");
            }
    
    }
}










// website for methods "string class methods in java"