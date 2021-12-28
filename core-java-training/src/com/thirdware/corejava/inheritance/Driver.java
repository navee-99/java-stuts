package com.thirdware.corejava.inheritance;

public class Driver {

	public static void main(String[] args) {
		
		Application app=new Application();
		Facebook facebook = new Facebook();
		Whatsapp whatsapp = new Whatsapp();
		
		app.workingPlatform();
		facebook.workingPlatform();
		whatsapp.workingPlatform();
		
		
	}
}
