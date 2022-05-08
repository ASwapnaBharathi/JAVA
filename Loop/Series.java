import java.util.*;

class Series{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n = sc.nextInt();
        int i = 1;

        while(n!=0){
            System.out.print(i+" ");
            i=i*2;
            n--;
        }
        
    }
}