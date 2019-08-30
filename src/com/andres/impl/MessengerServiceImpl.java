package com.andres.impl;

import com.andres.interfaces.MessagerService;

public class MessengerServiceImpl implements MessagerService {

	@Override
	public String sendMessage(String clientMessage) {
		
		return "Client message".equals(clientMessage) ? "Server Message ":null;
	}

}
