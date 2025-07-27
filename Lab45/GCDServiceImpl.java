package com.java.networkprogramming.labreport.qnsno45;

import java.rmi.server.*;
import java.rmi.*;

public class GCDServiceImpl extends UnicastRemoteObject implements GCDService {
    protected GCDServiceImpl() throws RemoteException { super(); }
    public int gcd(int a, int b) throws RemoteException {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) throws Exception {
        Naming.rebind("gcd", new GCDServiceImpl());
        System.out.println("GCD RMI Service Running...");
    }
}
