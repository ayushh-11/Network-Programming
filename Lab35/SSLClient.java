package com.java.networkprogramming.labreport.qnsno35;

import javax.net.ssl.*;
import java.io.*;

public class SSLClient {
    public static void main(String[] args) throws Exception {
        SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) sf.createSocket("localhost", 8443);
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        pw.println("Hello Secure Server");
        socket.close();
    }
}
