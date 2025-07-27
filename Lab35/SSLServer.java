package com.java.networkprogramming.labreport.qnsno35;

import javax.net.ssl.*;
import java.io.*;

public class SSLServer {
    public static void main(String[] args) throws Exception {
        SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        SSLServerSocket server = (SSLServerSocket) ssf.createServerSocket(8443);
        SSLSocket socket = (SSLSocket) server.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Secure message: " + br.readLine());
        server.close();
    }
}
