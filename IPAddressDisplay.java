import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressDisplay {
    public static void main(String[] args) {
        try {
            
            InetAddress inetAddress = InetAddress.getLocalHost();

            System.out.println("Hostname: " + inetAddress.getHostName());
            System.out.println("IP Address: " + inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Cannot get IP address.");
            e.printStackTrace();
        }
    }
}
