package com.java.networkprogramming.labreport.qnsno26;

import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9999);
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        String msg;
        while ((msg = in.readLine()) != null) {
            out.println("Echo: " + msg);
        }
        server.close();
    }
}
