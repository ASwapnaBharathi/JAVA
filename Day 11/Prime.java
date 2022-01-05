import java.util.Scanner;
public class Prime{
   public static void main(String args[]){		
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter start value:");
       int start=sc.nextInt();
       System.out.print("Enter end value:");
       int end=sc.nextInt();
       int i =0;
       int num =0;
       String  primeNumbers = "";
       for (i=start;i<=end;i++){	  	  
          int count=0; 	  
          for(num=i;num>=1;num--){
             if(i%num==0){
 		        count=count+1;
	        }
	    }
	    if (count==2){
	        primeNumbers = primeNumbers + i + " ";
	    }	
        }	
        System.out.println("Prime numbers between" + start+" and " +end+ " are:");
        System.out.println(primeNumbers);
   }
}