import java.util.*;

class Pattern24Q{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        
        int i,j,n = sc.nextInt();       

for (i=0; i<n; i++){
    for (j=n-i; j>1; j--){  
        System.out.print(" ");
        }
        for (j=0; j<=i; j++ ){
            System.out.print("* ");
        }   
System.out.println();
}   

for (int a=0; a<=n-1; a++){
    for (int b=0; b<=a; b++){  
        System.out.print(" ");
        }
        for (int k=1; k<=n-1-a; k++ ){
            System.out.print("* ");
        }   
System.out.println();
}   
   
}
}
        