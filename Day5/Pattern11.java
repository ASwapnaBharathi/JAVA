import java.util.Scanner;
public class Pattern11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int i, j;       
        for(i=0; i<rows; i++){  
            for(j=rows-i; j>1; j--){
                System.out.print(" ");   
                }   
                for(j=0; j<=i; j++ ){
                    System.out.print("* ");   
                }System.out.println();
        }
    }
}