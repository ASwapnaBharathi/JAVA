import java.util.Scanner;
public class Stdin_out{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int integer=scan.nextInt();
        Double double_val=scan.nextDouble();
        String line=scan.next();
        scan.close();
        System.out.println("String:" + line);
        System.out.println("Double:" + double_val);
        System.out.println("Integer:" + integer);
    }
}