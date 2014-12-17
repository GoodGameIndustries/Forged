package com.GGI.Screen;

import java.util.ArrayList;

import com.GGI.Forged.Forged;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MOTDScreen implements Screen,InputProcessor{
	
	public Forged f;
	public BitmapFont fnt;
	public float w = Gdx.graphics.getWidth(),h = Gdx.graphics.getHeight();
	private SpriteBatch pic;
	private String title;
	private String mOTD;
	private ArrayList<String> lines = new ArrayList<String>();
	
	public MOTDScreen(Forged f,String title,String mOTD){
		this.title=title;
		System.out.println(mOTD.length());
		String[] words = mOTD.split(" ");
		String currentLine = "";
		for(int i = 0; i < words.length;i++){
			if(currentLine.length()<25&&i!=words.length-1){
				currentLine+=words[i]+" ";
			}
			else{
				currentLine+=words[i]+" ";
				lines.add(currentLine);
				currentLine="";
				
			}
		}
		this.f=f;
		fnt=f.assets.font;
		
	}

	@Override
	public void render(float delta) {
		
		
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		
		pic.begin();
		
		fnt.setScale(w/7000);
		fnt.draw(pic,title,.4f*w,.65f*h);
		
		fnt.setScale(w/8000);
		for(int i = 0; i < lines.size();i++){
			
			fnt.draw(pic,lines.get(i),.4f*w,(.6f-(.05f*i))*h);
		}
		pic.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		pic = new SpriteBatch();
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
