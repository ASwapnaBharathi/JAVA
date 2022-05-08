import java.util.*;

class LuckyWinner{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("ENter your ticket number:");
        int n = sc.nextInt();

        if(n%10==3 || n%10==8){
            System.out.println("Lucky winner!");
        }else{
            System.out.println("Not a Lucky winner!");
        }
    }
}