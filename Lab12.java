//Write a program to check which protocol does a virtual machine support?
import java.net.*;

public class Lab12 {
    public static void main(String[] args) {
        try {
            String interfaceName = "ethernet_3";// change to your interface name
            NetworkInterface netIf = NetworkInterface.getByName(interfaceName);

            if (netIf == null) {
                System.out.println("Interface " + interfaceName + " not found.");
                return;
            }

            System.out.println("Interface: " + netIf.getName());

            if (!netIf.isUp()) {
                System.out.println("Status: DOWN");
                return;
            } else {
                System.out.println("Status: UP");
            }

            System.out.println("Supports Multicast: " + netIf.supportsMulticast());

            boolean supportsIPv4 = false;
            boolean supportsIPv6 = false;

            for (InetAddress addr : java.util.Collections.list(netIf.getInetAddresses())) {
                if (addr instanceof Inet4Address) supportsIPv4 = true;
                if (addr instanceof Inet6Address) supportsIPv6 = true;
            }

            System.out.println("Supports IPv4: " + supportsIPv4);
            System.out.println("Supports IPv6: " + supportsIPv6);

        } catch (SocketException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
