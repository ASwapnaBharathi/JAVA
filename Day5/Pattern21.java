import java.util.Scanner;
public class Pattern21{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=scan.nextInt();
        char ch='A';
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }
    }
}