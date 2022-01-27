import java.util.*;

public class Wordorder{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scan.nextLine();
        int length = str.length(); 
        scan.close();
        String inputString = Character.toUpperCase(str.charAt(0)) + str.substring(1, length);
        StringTokenizer st = new StringTokenizer(inputString);
        int wordCount = st.countTokens();
        String strArr[] = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            strArr[i] = st.nextToken();
        }
        
        for (int i = 0; i < wordCount - 1; i++) {
            for (int j = 0; j < wordCount - i - 1; j++) {
                if (strArr[j].length() >= strArr[j + 1].length()) {
                    String t = strArr[j];
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = t;
                }
            }
        }                    
        for (int i = 0; i < wordCount; i++) {
            System.out.print(strArr[i]+ " ");
        }
    }
}