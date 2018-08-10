package com.harbor.common;

import java.util.Random;
import java.util.UUID;


public class CustomIdGenrater {
	
	private int systime;

	public String generateUniqueKeyUsingUUID() {
		// Static factory to retrieve a type 4 (pseudo randomly generated) UUID
		
		String crunchifyUUID = UUID.randomUUID().toString();
		System.out.println(crunchifyUUID);
		return crunchifyUUID;
	}

}
