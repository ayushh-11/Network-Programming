package com.java.networkprogramming.labreport.qnsno40;

import java.net.*;

public class UDPTextClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket client = new DatagramSocket();
        byte[] msg = "Hello Server".getBytes();
        DatagramPacket p = new DatagramPacket(msg, msg.length, InetAddress.getLocalHost(), 7777);
        client.send(p);
        client.close();
    }
}
