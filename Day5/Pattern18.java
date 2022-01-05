public class Pattern19{
    public static void main(String args[]){
        char ch;
        for(ch='E';ch>='A';ch--){
            for(char i='A' ;i<=ch;i++){
                System.out.print(i);
            }System.out.println();
        }
    }
}