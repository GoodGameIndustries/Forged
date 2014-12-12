/**
 * 
 */
package com.GGI.Screen;

import java.awt.Point;
import java.awt.event.KeyEvent;


import com.GGI.Forged.Forged;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * @author Emmett Deen
 *
 */
public class MainMenuScreen implements Screen, InputProcessor{

	public Forged f;
	public BitmapFont font;
	
	public SpriteBatch pic = new SpriteBatch();
	public float w=Gdx.graphics.getWidth(),h=Gdx.graphics.getHeight();
	private TextField user;
	private TextField pass;
	private Rectangle uR;
	private Rectangle pR;
	public String u="";
	public String p="";
	public TextFieldStyle s;
	public int pointer = 0;
	public float oX=0f,oY=0f;
	public boolean invalid;
	
	
	public MainMenuScreen(Forged f){
		this.f=f;
		font = f.assets.font;
		font.setScale(w/6000);
		
		
		s = new  TextField.TextFieldStyle();
		s.background=new TextureRegionDrawable(f.assets.textBox);
		s.font=font;
		s.fontColor=new Color(1,1,1,1);
		s.background.setLeftWidth(s.background.getLeftWidth() + 2*(w/100));
		user = new TextField(u, s);
		user.setBounds(.3f*w,.54f*h,.4f*w,.1f*h);
		
		pass = new TextField(p,s);
		pass.setBounds(.3f*w,.34f*h,.4f*w,.1f*h);
		pass.setPasswordCharacter('x');
		pass.setPasswordMode(true);
		
		uR=new Rectangle(.3f*w,.54f*h,.4f*w,.1f*h);
		pR=new Rectangle(.3f*w,.34f*h,.4f*w,.1f*h);
		
		
	}
	
	@Override
	public void render(float delta) {
		u=u.replaceAll("\\p{Cntrl}","");
		p=p.replaceAll("\\p{Cntrl}","");
		
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		user.setText(u);
		pass.setText(p);
		
		pic.begin();
		font.setScale(w/1250);
		font.draw(pic, "Forged", ((.5f*w)- (font.getBounds("Forged").width/2))+oX, ((1.05f*h)- (font.getBounds("Forged").height/2))+oY);
		
		font.setScale(w/4000);
		font.draw(pic, "Username", ((.5f*w)- (font.getBounds("Username").width/2))+oX, ((.75f*h)- (font.getBounds("Username").height/2))+oY);
		font.draw(pic, "Password", ((.5f*w)- (font.getBounds("Password").width/2))+oX, ((.55f*h)- (font.getBounds("Password").height/2))+oY);
		
		
		 if(invalid){
			font.setColor(Color.RED);
			font.setScale(w/8000);
			font.draw(pic,"The username or password is incorrect",((w/2)-(font.getBounds("The username or password is incorrect").width/2))+oX,(.325f*h)+oY);
			font.setScale(w/4000);
			font.setColor(Color.WHITE);
		}
		
		user.setBounds((.3f*w)+oX,(.54f*h)+oY,.4f*w,.1f*h);
		pass.setBounds((.3f*w)+oX,(.34f*h)+oY,.4f*w,.1f*h);
		
		font.setScale(w/6000);
		s.font=font;
		user.draw(pic, 1);
		pass.draw(pic, 1);
		//pic.draw(f.assets.textBox,.3f*w,.39f*h,.4f*w,.1f*h);
		//pic.draw(f.assets.textBox,.3f*w,.19f*h,.4f*w,.1f*h);
		
		pic.draw(f.assets.login.getState(),f.assets.login.bounds.x,f.assets.login.bounds.y,f.assets.login.bounds.width,f.assets.login.bounds.height);
		pic.draw(f.assets.createAccount.getState(),f.assets.createAccount.bounds.x,f.assets.createAccount.bounds.y,f.assets.createAccount.bounds.width,f.assets.createAccount.bounds.height);
		
	
		
		pic.end();
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(this);
		
		
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
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		
		if(pointer==1){
			if(character == ''&&u.length()>0){
				u=u.substring(0, u.length()-1);
			}
			else if((character == '\r' || character == '\n')){}
			else{
				u+=character;
			}
		}
		else if(pointer==2){
			if(character == ''&&p.length()>0){
				p=p.substring(0, p.length()-1);
			}
			else if((character == '\r' || character == '\n')){}
			else{
				p+=character;
			}
		}
		else{
			System.out.println(character);
		}
		
		return true;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		screenY=(int) (h-screenY);
		Rectangle touch = new Rectangle(screenX,screenY,1,1);
				
		
			if(this.pointer==0){
				if(Intersector.overlaps(touch,f.assets.login.bounds)){
					f.assets.login.press();
				}
				if(Intersector.overlaps(touch,f.assets.createAccount.bounds)){
					f.assets.createAccount.press();
				}
			}
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		f.assets.login.release();
		f.assets.createAccount.release();
		
		screenY=(int) (h-screenY);
		Rectangle touch = new Rectangle(screenX,screenY,1,1);
		
		
		if(this.pointer==0){
			if(Intersector.overlaps(touch,uR)){
				this.pointer=1;
				Gdx.input.setOnscreenKeyboardVisible(true);
				oY=.1f*h;
			}
			else if(Intersector.overlaps(touch,pR)){
				this.pointer=2;
				Gdx.input.setOnscreenKeyboardVisible(true);
				oY=.3f*h;
			}
			else if(Intersector.overlaps(touch, f.assets.login.bounds)){
				f.send("login:"+u+":"+p);
			}
			else if(Intersector.overlaps(touch,f.assets.createAccount.bounds)){
				f.setScreen(new CreateAccountScreen(f));
			}
		}
		else{
			if(screenY>.5*h){
				this.pointer=0;
				Gdx.input.setOnscreenKeyboardVisible(false);
				oY=0f;
			}
		}
		return true;
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
