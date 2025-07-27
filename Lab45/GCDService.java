package com.java.networkprogramming.labreport.qnsno45;

import java.rmi.*;

public interface GCDService extends Remote {
    int gcd(int a, int b) throws RemoteException;
}
