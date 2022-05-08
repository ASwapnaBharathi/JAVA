import java.util.*;

class primeNumber{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n = scan.nextInt();
        int i = 0;
        int num = 0;
        String prime=" ";

        for(i=1;i<=n;i++){
            int counter=0;
            for(num=i;num>=1;num--){
                if(i%num==0){
                    counter+=1;
                }
            }
                if(counter==2){
                    prime=prime+i+" ";
                }
            }System.out.print(prime);
        }
        
    }
