package com.java.networkprogramming.labreport.qnsno45;

import java.rmi.*;

public class GCDClient {
    public static void main(String[] args) throws Exception {
        GCDService stub = (GCDService) Naming.lookup("gcd");
        System.out.println("GCD of 48 and 18 is: " + stub.gcd(48, 18));
    }
}
