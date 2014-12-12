package com.GGI.Screen;


import com.GGI.Forged.Forged;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class CreateAccountScreen implements Screen,InputProcessor{

	public Forged f;
	private BitmapFont font;
	private float w = Gdx.graphics.getWidth(),h=Gdx.graphics.getHeight();
	private TextFieldStyle s;
	private TextField user;
	private TextField pass;
	private TextField email;
	private String u="";
	private String p="";
	private String e="";
	private Rectangle uR;
	private Rectangle pR;
	private Rectangle eR;
	private SpriteBatch pic = new SpriteBatch();
	private float oX;
	private float oY;
	private int pointer=0;
	private boolean tooShort = false;
	public boolean accountTaken=false;
	
	
	public CreateAccountScreen(Forged f) {
		
		this.f=f;
		font = f.assets.font;
		font.setScale(w /6000);
		
		
		s = new  TextField.TextFieldStyle();
		s.background=new TextureRegionDrawable(f.assets.textBox);
		s.font=font;
		s.fontColor=new Color(1,1,1,1);
		s.background.setLeftWidth(s.background.getLeftWidth() + 2*(w/100));
		user = new TextField(u, s);
		user.setBounds(.1f*w,.6f*h,.5f*w,.1f*h);
		
		pass = new TextField(p,s);
		pass.setBounds(.1f*w,.4f*h,.5f*w,.1f*h);
		pass.setPasswordCharacter('x');
		pass.setPasswordMode(true);
		
		email = new TextField(e,s);
		email.setBounds(.1f*w,.8f*h,.5f*w,.1f*h);
		
		uR=new Rectangle(.1f*w,.6f*h,.5f*w,.1f*h);
		pR=new Rectangle(.1f*w,.4f*h,.5f*w,.1f*h);
		eR=new Rectangle(.1f*w,.8f*h,.5f*w,.1f*h);
		
		f.assets.createAccount.bounds=new Rectangle(.3f*w,.2f*h,.1f*w,.08f*h);
	}

	@Override
	public void render(float delta) {
		
		if(f.nextScreen!=null){
			f.setScreen(f.nextScreen);
			f.nextScreen=null;
		}
		e=e.replaceAll("\\p{Cntrl}","");
		u=u.replaceAll("\\p{Cntrl}","");
		p=p.replaceAll("\\p{Cntrl}","");
		
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		user.setText(u);
		pass.setText(p);
		email.setText(e);
		
		pic .begin();
		
		font.setScale(w/4000);
	font.draw(pic, "Username", .12f*w+oX, .75f*h+oY);
	font.draw(pic, "Password", .12f*w+oX, .55f*h+oY);
	font.draw(pic, "Email", .12f*w+oX, .95f*h+oY);
	
	if(tooShort){
		font.setColor(Color.RED);
		font.setScale(w/8000);
		font.draw(pic,"All fields must contain at least 4 characters",(.11f*w)+oX,(.35f*h)+oY);
		font.setScale(w/4000);
		font.setColor(Color.WHITE);
	}
	else if(accountTaken){
		font.setColor(Color.RED);
		font.setScale(w/8000);
		font.draw(pic,"The username you have entered is already in use",(.11f*w)+oX,(.35f*h)+oY);
		font.setScale(w/4000);
		font.setColor(Color.WHITE);
	}
		
		user.setBounds((.1f*w)+oX,(.6f*h)+oY,.5f*w,.1f*h);
		pass.setBounds((.1f*w)+oX,(.4f*h)+oY,.5f*w,.1f*h);
		email.setBounds((.1f*w)+oX,(.8f*h)+oY,.5f*w,.1f*h);
		
		font.setScale(w/6000);
		s.font=font;
		user.draw(pic, 1);
		pass.draw(pic, 1);
		email.draw(pic,1);
		//pic.draw(f.assets.textBox,.3f*w,.39f*h,.4f*w,.1f*h);
		//pic.draw(f.assets.textBox,.3f*w,.19f*h,.4f*w,.1f*h);
		pic.draw(f.assets.createAccount.getState(),f.assets.createAccount.bounds.x,f.assets.createAccount.bounds.y,f.assets.createAccount.bounds.width,f.assets.createAccount.bounds.height);
		pic.draw(f.assets.back.getState(),f.assets.back.bounds.x,f.assets.back.bounds.y,f.assets.back.bounds.width,f.assets.back.bounds.height);
		
		
		
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
		// TODO Auto-generated method stub
		return true;
	}

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
		else if(pointer==3){
			if(character == ''&&e.length()>0){
				e=e.substring(0, e.length()-1);
			}
			else if((character == '\r' || character == '\n')){}
			else{
				e+=character;
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
				if(Intersector.overlaps(touch, f.assets.createAccount.bounds)){
					f.assets.createAccount.press();
				}
				else if(Intersector.overlaps(touch, f.assets.back.bounds)){
					f.assets.back.press();
				}
			}
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		f.assets.createAccount.release();
		f.assets.back.release();
		
		screenY=(int) (h-screenY);
		Rectangle touch = new Rectangle(screenX,screenY,1,1);
		
		
		if(this.pointer==0){
			if(Intersector.overlaps(touch,uR)){
				this.pointer=1;
				Gdx.input.setOnscreenKeyboardVisible(true);
				oY=0f*h;
			}
			else if(Intersector.overlaps(touch,pR)){
				this.pointer=2;
				Gdx.input.setOnscreenKeyboardVisible(true);
				oY=.2f*h;
			}
			else if(Intersector.overlaps(touch,eR)){
				this.pointer=3;
				Gdx.input.setOnscreenKeyboardVisible(true);
				oY=-.2f*h;
			}
			else if(Intersector.overlaps(touch, f.assets.createAccount.bounds)){
				if(e.length()>3&&u.length()>3&&p.length()>3){
				f.send("createAccount:"+e+":"+u+":"+p);
				}
				else{
					tooShort=true;
				}
			}
			else if(Intersector.overlaps(touch, f.assets.back.bounds)){
				f.assets.createAccount.bounds=new Rectangle(.45f*w,.08f*h,.1f*w,.08f*h);
				f.setScreen(new MainMenuScreen(f));
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
