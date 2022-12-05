import java.util.*;

class Operators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt();
        

        System.out.println("Unary Operator: ");
        System.out.println("Postfix increment: "+a++);
        System.out.println("Postfix decrement: "+a--);
        System.out.println("Prefix increment: "+(++a));
        System.out.println("Prefix decrement: "+(--a));

        System.out.println("Shift Operator:");

        System.out.println(10>>a);
        System.out.println(10<<a);

        System.out.println("relational Operator:");
        int b = sc.nextInt();

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        System.out.println("Bitwise Operator:");
        System.out.println(a&b);
        System.out.println(~b);
        System.out.println(a|b);

        System.out.println("Logical Operator:"); 
        int c = 0;           
        System.out.println(c=(a<b)?a:b);

        System.out.println("Assignment Operator:");
        System.out.println(a=b);

    }
}