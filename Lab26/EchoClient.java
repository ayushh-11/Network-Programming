package com.java.networkprogramming.labreport.qnsno26;

import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9999);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String msg;
        while ((msg = kb.readLine()) != null) {
            out.println(msg);
            System.out.println(in.readLine());
        }
        socket.close();
    }
}
