public class Pattern25{
    public static void main(String args[]){
     char ch;
     for(ch='A';ch<='E';ch++){
         for(char i='A';i<=ch;i++){
             System.out.print(i);
        }System.out.println();
    }
    for(ch='D';ch>='A';ch--){
            for(char i='A' ;i<=ch;i++){
                System.out.print(i);
            }System.out.println();
        }
    }
}