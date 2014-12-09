package com.GGI.Forged;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.GGI.Screen.CharacterCreationScreen;
import com.badlogic.gdx.net.Socket;

public class Reader implements Runnable{

	public Socket r;
	public Forged f;
	
	public Reader(Forged f, Socket r){
		this.f=f;
		this.r=r;
	}
	
	@Override
	public void run() {
		while(true){
			String message;
			try {
				message = new BufferedReader(new InputStreamReader(r.getInputStream())).readLine();
				System.out.println(message);
				if(message.equals("accountCreated")){
					System.out.println("setting next screen");
					f.nextScreen=new CharacterCreationScreen(f);
				}
			} catch (IOException e) {
				
			}
			
		}
		
	}

}
