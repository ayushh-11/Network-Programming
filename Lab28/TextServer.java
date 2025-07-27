package com.java.networkprogramming.labreport.qnsno28;

import java.io.*;
import java.net.*;

public class TextServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1236);
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Received: " + line);
        }
        server.close();
    }
}
