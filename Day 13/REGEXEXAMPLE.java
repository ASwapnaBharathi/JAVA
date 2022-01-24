import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class REGEXEXAMPLE{
     public static void main(String args[]) {
         final String REGEXPATTERN="[a-z0-9]+@[A-Za-z]";
         Pattern email = Pattern.compile(REGEXPATTERN);
         try{
            FileReader fr = new FileReader("C:\\Users\\lenovo\\Desktop\\swapna\\email.txt");
            BufferedReader br = new BufferedReader(fr);
     
            String line;
     
            while((line = br.readLine()) !=null){
                 Matcher m = email.matcher(line);
                 if(m.find()){
                     System.out.println(line);
                 }
             }
             br.close();
     
            } catch (IOException e){
                e.printStackTrace();
            }
        
    }
}
