package com.GGI.Screen;

import com.GGI.Forged.Forged;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;

public class CharacterCreationScreen implements Screen,InputProcessor{

	public Forged f;
	public SpriteBatch pic;
	private BitmapFont fnt;
	private float w=Gdx.graphics.getWidth(),h=Gdx.graphics.getHeight();
	private int hairS=0;
	private int hairC=0;
	private int skin=0;
	private int chest=0;
	private int legs=0;
	
	private float width=.5f*w,height=.5f*w;
	
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
		
		pic.draw(f.assets.legs[legs],(float).65*w-(width/2),(float).55*h-(height/2),width,height);
		pic.draw(f.assets.chest[chest],(float).65*w-(width/2),(float).55*h-(height/2),width,height);
		pic.draw(f.assets.skin[skin],(float).65*w-(width/2),(float).55*h-(height/2),width,height);
		pic.draw(f.assets.hair[hairC][hairS],(float).65*w-(width/2),(float).55*h-(height/2),width,height);
		
		pic.draw(f.assets.createCharacter.getState(),f.assets.createCharacter.bounds.x,f.assets.createCharacter.bounds.y,f.assets.createCharacter.bounds.width,f.assets.createCharacter.bounds.height);

		pic.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		pic = new SpriteBatch();
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
		screenY=(int) (h-screenY);
		Rectangle touch = new Rectangle(screenX,screenY,1,1);
		//adding
		if(Intersector.overlaps(touch, f.assets.hairColorRight.bounds)){
			f.assets.hairColorRight.press();
		}
		else if(Intersector.overlaps(touch, f.assets.hairRight.bounds)){
			f.assets.hairRight.press();
		}
		else if(Intersector.overlaps(touch, f.assets.hairRight.bounds)){
			f.assets.skinRight.press();
		}
		else if(Intersector.overlaps(touch, f.assets.hairRight.bounds)){
			f.assets.chestRight.press();
		}
		else if(Intersector.overlaps(touch, f.assets.hairRight.bounds)){
			f.assets.legsRight.press();
		}
		
		//subtracting
		if(Intersector.overlaps(touch, f.assets.hairColorLeft.bounds)){
			f.assets.hairColorLeft.press();
		}
		else if(Intersector.overlaps(touch, f.assets.hairLeft.bounds)){
			f.assets.hairLeft.press();
		}
		else if(Intersector.overlaps(touch, f.assets.hairLeft.bounds)){
			f.assets.skinLeft.press();
		}
		else if(Intersector.overlaps(touch, f.assets.hairLeft.bounds)){
			f.assets.chestLeft.press();
		}
		else if(Intersector.overlaps(touch, f.assets.hairLeft.bounds)){
			f.assets.legsLeft.press();
		}
			
		
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		f.assets.hairColorRight.release();
		f.assets.hairColorLeft.release();
		f.assets.hairRight.release();
		f.assets.hairLeft.release();
		f.assets.skinRight.release();
		f.assets.skinLeft.release();
		f.assets.chestRight.release();
		f.assets.chestLeft.release();
		f.assets.legsRight.release();
		f.assets.legsLeft.release();
		
		screenY=(int) (h-screenY);
		Rectangle touch = new Rectangle(screenX,screenY,1,1);
		//adding
				if(Intersector.overlaps(touch, f.assets.hairColorRight.bounds)){
					hairC++;
					if(hairC>=f.assets.hair.length){
						hairC=0;
					}
				}
				else if(Intersector.overlaps(touch, f.assets.hairRight.bounds)){
					hairS++;
					if(hairS>=f.assets.hair[0].length){
						hairS=0;
					}
				}
				else if(Intersector.overlaps(touch, f.assets.skinRight.bounds)){
					skin++;
					if(skin>=f.assets.skin.length){
						skin=0;
					}
				}
				else if(Intersector.overlaps(touch, f.assets.chestRight.bounds)){
					chest++;
					if(chest>=f.assets.chest.length){
						chest=0;
					}
				}
				else if(Intersector.overlaps(touch, f.assets.legsRight.bounds)){
					legs++;
					if(legs>=f.assets.legs.length){
						legs=0;
					}
				}
		//subtracting
				if(Intersector.overlaps(touch, f.assets.hairColorLeft.bounds)){
					hairC--;
					if(hairC<0){
						hairC=f.assets.hair.length-1;
					}
				}
				else if(Intersector.overlaps(touch, f.assets.hairLeft.bounds)){
					hairS--;
					if(hairS<0){
						hairS=f.assets.hair[0].length-1;
					}
				}
				else if(Intersector.overlaps(touch, f.assets.skinLeft.bounds)){
					skin--;
					if(skin<0){
						skin=f.assets.skin.length-1;
					}
				}
				else if(Intersector.overlaps(touch, f.assets.chestLeft.bounds)){
					chest--;
					if(chest<0){
						chest=f.assets.chest.length-1;
					}
				}
				else if(Intersector.overlaps(touch, f.assets.legsLeft.bounds)){
					legs--;
					if(legs<0){
						legs=f.assets.legs.length-1;
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
