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

    public static void checkIPType(String ip) {
        try {
            InetAddress address = InetAddress.getByName(ip);

            if (address instanceof Inet4Address) {
                System.out.println(ip + " is a valid IPv4 address.");
            } else if (address instanceof Inet6Address) {
                System.out.println(ip + " is a valid IPv6 address.");
            } else {
                System.out.println(ip + " is an unknown type of IP address.");
            }
        } catch (UnknownHostException e) {
            System.out.println(ip + " is an invalid IP address.");
        }
    }
}
