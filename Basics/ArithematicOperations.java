import java.util.*;

class ArithematicOperations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'a' value: ");
        int a = sc.nextInt();
        System.out.print("Enter 'b' value: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Addition of a and b: "+(a+b));
        System.out.println("Subtraction of a and b: "+(a-b));
        System.out.println("Multiplication of a and b: "+(a*b));
        System.out.println("Division of a and b: "+(a/b));
        System.out.println("Modulus of a and b: "+(a%b));
        
    }
}