package com.java.networkprogramming.labreport.qnsno31;

import java.io.*;
import java.net.*;

public class PrimeClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1239);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.println("29");
        System.out.println(in.readLine());
        socket.close();
    }
}
