import java.util.Scanner;
public class Pattern19{
    public static void main(String args[]){
        char ch;
        for(ch='A';ch<='E';ch++){
            for(char i='E' ;i>=ch;i--){
                System.out.print(i);
            }System.out.println();
        }
    }
}