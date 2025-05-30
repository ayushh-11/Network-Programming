//Write a program to print the characteristics (address types) of an IP address.

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressCharacterstics {

    public static void main(String[] args) {
        try {
            String ipAddress = "127.0.0.1";
            InetAddress address = InetAddress.getByName(ipAddress);

            System.out.println("IP Address: " + address.getHostAddress());

            System.out.println("Is Loopback Address? " + address.isLoopbackAddress());
            System.out.println("Is Any Local Address? " + address.isAnyLocalAddress());
            System.out.println("Is Link Local Address? " + address.isLinkLocalAddress());
            System.out.println("Is Site Local Address? " + address.isSiteLocalAddress());
            System.out.println("Is Multicast Address? " + address.isMulticastAddress());

        } catch (UnknownHostException e) {
            System.out.println("Invalid IP address.");
            e.printStackTrace();
        }
    }
}
