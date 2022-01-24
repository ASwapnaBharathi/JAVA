import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.io.IOException;

public class Test{
    
    public static void main(String args[]){
       
       final String REGEX_PATTERN ="foox*bar"; //Its basically a normal string
       Pattern r =Pattern.compile(REGEX_PATTERN); //YOUR NORMAL STRING HAS BECOME rEGEX PATTERN

       try{
       FileReader fr = new FileReader("C:\\Users\\lenovo\\Desktop\\swapna\\data.txt");
       BufferedReader br = new BufferedReader(fr);

       String line;

       while((line = br.readLine()) !=null){
            Matcher m = r.matcher(line);
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
