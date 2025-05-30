//2.Write a program to implement InetAddress getter methods. 

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressGetter {
    public static void main(String[] args) {
        try {
            // Get local host address
            InetAddress inet = InetAddress.getLocalHost();

            // Display details using getter methods
            System.out.println("Host Name       : " + inet.getHostName());
            System.out.println("Host Address    : " + inet.getHostAddress());
            System.out.println("Canonical Host  : " + inet.getCanonicalHostName());
            System.out.println("Is Loopback     : " + inet.isLoopbackAddress());
            System.out.println("Is Reachable    : " + inet.isReachable(2000)); // 2000 ms timeout
            System.out.println("Is Multicast    : " + inet.isMulticastAddress());

        } catch (UnknownHostException e) {
            System.out.println("Error: Unknown Host");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
