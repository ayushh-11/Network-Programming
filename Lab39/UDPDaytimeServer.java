package com.java.networkprogramming.labreport.qnsno39;

import java.net.*;
import java.util.*;

public class UDPDaytimeServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket server = new DatagramSocket(8888);
        byte[] buf = new byte[100];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        server.receive(packet);
        String time = new Date().toString();
        byte[] t = time.getBytes();
        server.send(new DatagramPacket(t, t.length, packet.getAddress(), packet.getPort()));
        server.close();
    }
}
