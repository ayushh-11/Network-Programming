package com.java.networkprogramming.labreport.qnsno41;

import java.net.*;

public class UDPArmstrongClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] num = "153".getBytes();
        socket.send(new DatagramPacket(num, num.length, InetAddress.getLocalHost(), 5005));
        DatagramPacket packet = new DatagramPacket(new byte[100], 100);
        socket.receive(packet);
        System.out.println("Result: " + new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}