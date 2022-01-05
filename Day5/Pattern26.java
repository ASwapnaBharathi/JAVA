import java.util.Scanner;
public class Pattern26{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=scan.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int k=num-1;k>=1;k--){
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }System.out.println();
        }
    }
}