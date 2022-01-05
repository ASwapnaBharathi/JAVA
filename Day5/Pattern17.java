import java.util.Scanner;
public class Pattern17{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=scan.nextInt();
        int n=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+ " ");
                n++;
            }System.out.println();
        }
    }
}