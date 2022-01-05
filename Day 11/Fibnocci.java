import java.util.Scanner;
public class Fibnocci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int i=0,j=1,k;
        for(int l=2;l<=num;l++){
            k=i+j;
            System.out.print(" "+k);
            i=j;
            j=k;
        }
    }
}