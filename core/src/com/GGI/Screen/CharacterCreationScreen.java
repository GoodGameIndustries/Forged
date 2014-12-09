package com.GGI.Screen;

import com.GGI.Forged.Forged;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CharacterCreationScreen implements Screen{

	public Forged f;
	public SpriteBatch pic;
	private BitmapFont fnt;
	private float w=Gdx.graphics.getWidth(),h=Gdx.graphics.getHeight();
	public CharacterCreationScreen(Forged f){
		this.f=f;
		fnt=f.assets.font;
		fnt.setScale(w/6000);
		
	}
	
	@Override
	public void render(float delta) {
		
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		
		pic.begin();
		pic.draw(f.assets.hairColorRight.getState(),f.assets.hairColorRight.bounds.x,f.assets.hairColorRight.bounds.y,f.assets.hairColorRight.bounds.width,f.assets.hairColorRight.bounds.height);
		pic.draw(f.assets.hairColorLeft.getState(),f.assets.hairColorLeft.bounds.x,f.assets.hairColorLeft.bounds.y,f.assets.hairColorLeft.bounds.width,f.assets.hairColorLeft.bounds.height);
		pic.draw(f.assets.hairRight.getState(),f.assets.hairRight.bounds.x,f.assets.hairRight.bounds.y,f.assets.hairRight.bounds.width,f.assets.hairRight.bounds.height);
		pic.draw(f.assets.hairLeft.getState(),f.assets.hairLeft.bounds.x,f.assets.hairLeft.bounds.y,f.assets.hairLeft.bounds.width,f.assets.hairLeft.bounds.height);
		pic.draw(f.assets.skinRight.getState(),f.assets.skinRight.bounds.x,f.assets.skinRight.bounds.y,f.assets.skinRight.bounds.width,f.assets.skinRight.bounds.height);
		pic.draw(f.assets.skinLeft.getState(),f.assets.skinLeft.bounds.x,f.assets.skinLeft.bounds.y,f.assets.skinLeft.bounds.width,f.assets.skinLeft.bounds.height);
		pic.draw(f.assets.chestRight.getState(),f.assets.chestRight.bounds.x,f.assets.chestRight.bounds.y,f.assets.chestRight.bounds.width,f.assets.chestRight.bounds.height);
		pic.draw(f.assets.chestLeft.getState(),f.assets.chestLeft.bounds.x,f.assets.chestLeft.bounds.y,f.assets.chestLeft.bounds.width,f.assets.chestLeft.bounds.height);
		pic.draw(f.assets.legsRight.getState(),f.assets.legsRight.bounds.x,f.assets.legsRight.bounds.y,f.assets.legsRight.bounds.width,f.assets.legsRight.bounds.height);
		pic.draw(f.assets.legsLeft.getState(),f.assets.legsLeft.bounds.x,f.assets.legsLeft.bounds.y,f.assets.legsLeft.bounds.width,f.assets.legsLeft.bounds.height);
		fnt.draw(pic, "Hair Color", .1f*w, .775f*h);
		fnt.draw(pic, "Hair Style", .1f*w, .675f*h);
		fnt.draw(pic, "Skin Color", .1f*w, .575f*h);
		fnt.draw(pic, "Shirt Style", .1f*w, .475f*h);
		fnt.draw(pic, "Pant Style", .1f*w, .375f*h);
		
		
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

}
