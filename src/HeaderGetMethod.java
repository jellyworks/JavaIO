import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HeaderGetMethod {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.naver.com");
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            InputStreamReader isr = new InputStreamReader(con.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String temp;
            int rank=0;
            while((temp = br.readLine()) != null){
                if(temp.contains("class=\"ah_k\"") && rank < 20){
                    System.out.println(++rank + ":"+temp.split(">")[1].split("<")[0]);
                }
            }
            con.disconnect();
            br.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
