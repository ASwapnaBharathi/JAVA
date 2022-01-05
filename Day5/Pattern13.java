public class Pattern13{
    public static void main(String args []){
        int rows=8;
         int alphabet=65;
        for (int i=0;i<=rows;i++){
            for(int j=0;j<=rows;j++){
            System.out.print(" ");
            }
            rows--;
            for (int k = 1; k <= i; k++){
                System.out.print((char) (alphabet + k) + " ");
            }System.out.println();
        
        }
    }
}