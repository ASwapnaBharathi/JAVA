import java.util.Scanner;
import java.io.*;
public class Prime{    
 public static void main(String args[]){    
  Scanner sc=new Scanner(System.in);
  int prime=sc.nextInt();
  int count=0,val;    
  val=prime/2;   
  if(prime==0||prime==1){  
   System.out.println(prime+" is not prime number");      
         }else{  
            for(int i=2;i<=val;i++){      
                if(prime%i==0){      
                System.out.println(prime+" is not prime number");      
                count=1;      
                break;      
                }      
            }if(count==0){ 
                System.out.println(prime+" is prime number"); }  
        }  
    }    
}   
