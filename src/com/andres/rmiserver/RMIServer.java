package com.andres.rmiserver;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.andres.interfaces.MessagerService;

public class RMIServer extends UnicastRemoteObject implements MessagerService{
	
	private static final long serialVersionUID = 1L;
	
	protected RMIServer() throws RemoteException{
		super();
	}
	
	@Override
	public String sendMessage(String clientMessage) throws RemoteException {
		System.err.println(clientMessage+" is trying to contact!!");
		return "Server says hello to "+clientMessage;
	}



	public static void main(String[] args) {
		try {
			Naming.rebind("//localhost/Myserver", new RMIServer());
			System.err.println("server ready!!");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
