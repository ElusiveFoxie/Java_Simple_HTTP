import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleHTTP {

    public static void main(String[] args) throws IOException {

        URL url = new URL("url");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        String response = FullResponseBuilder.getFullResponse(con);
        con.disconnect();

        System.out.println(response);

    }
}
