package com.java.networkprogramming.labreport.qnsno29;

import java.io.*;
import java.net.*;

public class FactorialClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1237);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.println("5");
        System.out.println(in.readLine());
        socket.close();
    }
}

