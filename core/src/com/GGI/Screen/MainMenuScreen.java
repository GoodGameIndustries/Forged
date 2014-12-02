/**
 * 
 */
package com.GGI.Screen;

import com.GGI.Forged.Forged;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Emmett Deen
 *
 */
public class MainMenuScreen implements Screen{

	public Forged f;
	public BitmapFont font;
	public SpriteBatch pic = new SpriteBatch();
	public float w=Gdx.graphics.getWidth(),h=Gdx.graphics.getHeight();
	
	public MainMenuScreen(Forged f){
		this.f=f;
		font = f.assets.font;
		
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		font.setScale(w/1250);
		pic.begin();
		font.draw(pic, "Forged", (.5f*w)- (font.getBounds("Forged").width/2), (.9f*h)- (font.getBounds("Forged").height/2));
		font.setScale(w/3000);
		font.draw(pic, "Email", (.5f*w)- (font.getBounds("Email").width/2), (.6f*h)- (font.getBounds("Email").height/2));
		font.draw(pic, "Password", (.5f*w)- (font.getBounds("Password").width/2), (.4f*h)- (font.getBounds("Password").height/2));
		
		pic.draw(f.assets.textBox,.3f*w,.39f*h,.4f*w,.1f*h);
		pic.draw(f.assets.textBox,.3f*w,.19f*h,.4f*w,.1f*h);
		pic.end();
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
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
