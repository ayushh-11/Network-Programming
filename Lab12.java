import java.net.URL;

public class ProtocolSupportChecker {
    public static void main(String[] args) {
        String[] protocols = {
            "http", "https", "ftp", "file", "jar", "mailto", "gopher", "nfs", "jdbc"
        };

        for (String protocol : protocols) {
            try {
                URL url = new URL(protocol + "://example.com");
                url.openConnection(); // Try to open a connection
                System.out.println(protocol + " is supported.");
            } catch (Exception e) {
                System.out.println(protocol + " is NOT supported.");
            }
        }
    }
}
