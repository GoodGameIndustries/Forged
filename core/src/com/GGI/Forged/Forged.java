package com.GGI.Forged;

import com.GGI.Assets.Assets;
import com.GGI.Screen.GameScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class Forged extends Game {
	public Assets assets = new Assets(this);
	
	@Override
	public void create () {
		setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		
	}
}
