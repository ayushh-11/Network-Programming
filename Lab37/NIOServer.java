package com.java.networkprogramming.labreport.qnsno37;

import java.nio.*;
import java.nio.channels.*;
import java.net.*;

public class NIOServer {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel server = ServerSocketChannel.open();
        server.socket().bind(new InetSocketAddress(9000));
        SocketChannel client = server.accept();
        ByteBuffer buffer = ByteBuffer.allocate(256);
        client.read(buffer);
        System.out.println("Received: " + new String(buffer.array()).trim());
        server.close();
    }
}