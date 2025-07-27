package com.java.networkprogramming.labreport.qnsno39;

import java.net.*;

public class UDPDaytimeClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket client = new DatagramSocket();
        client.send(new DatagramPacket(new byte[1], 1, InetAddress.getLocalHost(), 8888));
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        client.receive(packet);
        System.out.println("Server Time: " + new String(packet.getData(), 0, packet.getLength()));
        client.close();
    }
}
