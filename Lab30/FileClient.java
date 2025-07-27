package com.java.networkprogramming.labreport.qnsno30;

import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1238);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) System.out.println(line);
        socket.close();
    }
}
