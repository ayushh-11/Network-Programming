import java.net.HttpURLConnection;
import java.net.URL;

public class Lab22 {
    public static void main(String[] args) {
        try {
            // Target URL
            URL url = new URL("https://www.example.com");

            // Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Connect to the URL
            connection.connect();

            // Print headers using getHeaderFieldKey and getHeaderField
            System.out.println("HTTP Response Headers:\n");
            int i = 0;
            while (true) {
                String headerKey = connection.getHeaderFieldKey(i);
                String headerValue = connection.getHeaderField(i);
                if (headerKey == null && headerValue == null) {
                    break; // End of headers
                }
    
                System.out.println(headerKey + ": " + headerValue);
                i++;
            }

            // Disconnect
            connection.disconnect();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
