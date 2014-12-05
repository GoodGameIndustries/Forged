package com.GGI.Forged;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.GGI.Assets.Assets;
import com.GGI.Screen.GameScreen;
import com.GGI.Screen.MainMenuScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net.Protocol;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.net.Socket;
import com.badlogic.gdx.net.SocketHints;

public class Forged extends Game {
	public Assets assets;
	Socket sClient;
	Socket rClient;
	
	public Forged(){

	}
	
	@Override
	public void create () {
		
	    assets= new Assets(this);
		setScreen(new MainMenuScreen(this));
		SocketHints hints = new SocketHints();
		sClient = Gdx.net.newClientSocket(Protocol.TCP, "192.168.1.100", 4441, hints);
		rClient = Gdx.net.newClientSocket(Protocol.TCP, "192.168.1.100", 4442, hints);
		try {
			sClient.getOutputStream().write("Connect\n".getBytes());
			String response = new BufferedReader(new InputStreamReader(rClient.getInputStream())).readLine();
			System.out.println(response);
		} catch (IOException e) {
			System.out.println("an error occured");
		}
		
		new Thread(new Reader(this,rClient)).start();
		
		//while(true){
			//send("test\n");
		//}
		//String response = new BufferedReader(new InputStreamReader(rClient.getInputStream())).readLine();
		//System.out.println(response);
		
		
	}

	
	
	public void send(String s){
		try {
			sClient.getOutputStream().write(s.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
