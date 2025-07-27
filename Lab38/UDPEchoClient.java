package com.java.networkprogramming.labreport.qnsno38;

import java.net.*;

public class UDPEchoClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket client = new DatagramSocket();
        byte[] msg = "Hello UDP".getBytes();
        DatagramPacket p = new DatagramPacket(msg, msg.length, InetAddress.getLocalHost(), 1111);
        client.send(p);
        DatagramPacket r = new DatagramPacket(new byte[1024], 1024);
        client.receive(r);
        System.out.println("Received: " + new String(r.getData(), 0, r.getLength()));
        client.close();
    }
}