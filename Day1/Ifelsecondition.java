import java.util.Scanner;
public class Ifelsecondition{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num%2!=0){
            System.out.println("Weird!");
            }else{
                if(num%2==0){
                    if(num>=2 && num<=5){
                        System.out.println("Not weird");
                    }else{
                        if(num>=6 && num<=20){
                            System.out.println("Weird!");
                        }else{
                            System.out.println("Not weird");
                        }
                    }
                }
            }

        }
    }
