import java.util.*;

class Amount{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount:");
        int n = sc.nextInt();
        

        if(n%500==0){
            System.out.println("500  = "+n/500);
        }else if(n%500!=0){
            System.out.println("500 = "+n/500);
        }
        
        int a = n%500;
        if(a%100==0){
            System.out.println("100  = "+a/100);
        }else if(a%100!=0){
            System.out.println("100 = "+a/100);
        }
        
        int b = a%100;
        if(b%50==0){
            System.out.println("50  = "+b/50);
        }else if(b%50!=0){
            System.out.println("50 = "+b/50);
        }

        int c = b%50;
        if(c%20==0){
            System.out.println("20  = "+c/20);
        }else if(c%20!=0){
            System.out.println("20 = "+c/20);
        }

        int d = c%20;
        if(d%10==0){
            System.out.println("10  = "+d/10);
        }else if(d%10!=0){
            System.out.println("10 = "+d/10);
        }
        
        int e = d%10;
        if(e%5==0){
            System.out.println("5  = "+e/5);
        }else if(e%5!=0){
            System.out.println("5 = "+e/5);
        }
        
        int f = e%5;
        
        if(f%2==0){
            System.out.println("2  = "+f/2);
        }else if(f%2!=0){
            System.out.println("2 = "+f/2);
        }

        int g = f%2;
        
        if(g%1==0){
            System.out.println("1  = "+g/1);
        }else if(g%1!=0){
            System.out.println("1  = "+g/1);
        }
    }
}