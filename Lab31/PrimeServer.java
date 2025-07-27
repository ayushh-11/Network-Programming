package com.java.networkprogramming.labreport.qnsno31;
import java.io.*;
import java.net.*;

public class PrimeServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1239);
        while (true) {
            Socket socket = server.accept();
            new Thread(() -> {
                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    int n = Integer.parseInt(in.readLine());
                    out.println(isPrime(n) ? "Prime" : "Not Prime");
                    socket.close();
                } catch (Exception e) {}
            }).start();
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}
