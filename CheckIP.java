//Write a program to check IPv4 and IPv6 Address.

import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.UnknownHostException;

public class CheckIP {
    public static void main(String[] args) {
        // Replace these with any IP address you want to test
        String ipv4Address = "192.168.0.1";
        String ipv6Address = "2001:db8::1";

        System.out.println("Checking IPv4 Address:");
        checkIPType(ipv4Address);

        System.out.println("\nChecking IPv6 Address:");
        checkIPType(ipv6Address);
    }

    public static void checkIPType(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4) System.out.println("Ip v4 address);       // IPv4
        else if (address.length == 16) System.out.println("Ip v6 address) // IPv6
        else return -1;                          // Unknown
    }
}
