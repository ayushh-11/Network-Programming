import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Lab24 {
    public static void main(String[] args) {
        String webpageUrl = "https://www.facebook.com";

        try {
            // Create URL object
            URL url = new URL(webpageUrl);

            URLConnection connection = url.openConnection();

            

            // Get input stream from connection
            InputStream inputStream = connection.getInputStream();

            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData); 
            }

            // Close stream
            inputStream.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
