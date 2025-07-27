package com.java.networkprogramming.labreport.qnsno37;

import java.nio.*;
import java.nio.channels.*;
import java.net.*;

public class NIOClient {
    public static void main(String[] args) throws Exception {
        SocketChannel socket = SocketChannel.open(new InetSocketAddress("localhost", 9000));
        ByteBuffer buffer = ByteBuffer.wrap("Hello from NIO Client".getBytes());
        socket.write(buffer);
        socket.close();
    }
}
