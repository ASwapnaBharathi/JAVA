import java.util.Scanner;
public class Pattern7{
    public static void main(String args []){
        Scanner scan =new Scanner(System.in);
        int rows=scan.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=0; j<rows-i; j++){
                System.out.print(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print(k+" ");
                }System.out.println();
        }
    }
}