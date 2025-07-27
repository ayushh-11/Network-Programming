package com.java.networkprogramming.labreport.qnsno28;

import java.io.*;
import java.net.*;

public class TextClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1236);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while ((msg = kb.readLine()) != null) out.println(msg);
        socket.close();
    }
}
