//Write a program to illustrate factory and getter methods of NetworkInterface Class.
import java.net.*;

public class Lab9 {

    public static void main(String[] args) {
        try {
            // Factory Method
            NetworkInterface netIf = NetworkInterface.getByName("ethernet_3");

            if (netIf != null) {
                // Getter Methods
                System.out.println("Name: " + netIf.getName());                
                System.out.println("Display Name: " + netIf.getDisplayName()); 
                System.out.println("Is Up: " + netIf.isUp());                 
                System.out.println("Is Loopback: " + netIf.isLoopback());      
                System.out.println("Supports Multicast: " + netIf.supportsMulticast()); 
            } else {
                System.out.println("Interface 'ethernet_3' not found.");
            }

        } catch (SocketException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
