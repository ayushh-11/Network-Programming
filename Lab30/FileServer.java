package com.java.networkprogramming.labreport.qnsno30;

import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1238);
        Socket socket = server.accept();
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        String line;
        while ((line = br.readLine()) != null) out.println(line);
        server.close();
    }
}
