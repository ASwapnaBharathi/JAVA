public class Pattern30{
    public static void main(String args[]){
        char ch;
        for(ch='E';ch>='A';ch--){
            for(char i='A' ;i<=ch;i++){
                System.out.print(i);
            }System.out.println();
        }
        for(ch='B';ch<='E';ch++){
            for(char i='A';i<=ch;i++){
             System.out.print(i);
        }System.out.println();
        }
    
    }
}