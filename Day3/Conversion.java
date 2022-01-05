import java.util.Scanner;
public class Conversion{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n>=-100 && n<=100){	
				String s=n+" ";
				System.out.println("Good job");
        }else
			System.out.println("Wrong answer");
	}
}