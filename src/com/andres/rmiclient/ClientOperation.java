package com.andres.rmiclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.andres.interfaces.MessagerService;

public class ClientOperation {
	
	private static MessagerService look_up;
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		look_up = (MessagerService) Naming.lookup("//localhost/Myserver");
		String txt = JOptionPane.showInputDialog("Whats your name?");
		
		String response = look_up.sendMessage(txt);
		JOptionPane.showMessageDialog(null, response);
	}

}
