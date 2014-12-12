package com.GGI.Forged;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.GGI.Screen.CharacterCreationScreen;
import com.GGI.Screen.CreateAccountScreen;
import com.GGI.Screen.MainMenuScreen;
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
				
				if(message.equals("Invalid")){
					if(f.getScreen() instanceof MainMenuScreen){
						MainMenuScreen s = (MainMenuScreen) f.getScreen();
						s.invalid=true;
								
					}
				}
				else if(message.equals("accountCreated")){
					System.out.println("setting next screen");
					f.nextScreen=new CharacterCreationScreen(f);
				}
				else if(message.equals("Error Creating")){
					if(f.getScreen() instanceof CreateAccountScreen){
						CreateAccountScreen s = (CreateAccountScreen) f.getScreen();
						s.accountTaken=true;
					}
				}
			} catch (IOException e) {
				
			}
			
		}
		
	}

}
