package com.andres.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessagerService extends Remote {	
	String sendMessage(String clientMessage) throws RemoteException;
}
