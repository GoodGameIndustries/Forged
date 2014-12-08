/**
 * 
 */
package com.GGI.UI.Button;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

/**
 * @author Emmett Deen
 *
 */
public class Button {
	private Texture up;
	private Texture down;
	private Texture current;
	public Rectangle bounds;
	private float w=Gdx.graphics.getWidth(),h=Gdx.graphics.getHeight();
	
	public Button(String f1, String f2,float x,float y,float w,float h){
		up = new Texture(Gdx.files.internal(f1));
		down = new Texture(Gdx.files.internal(f2));
		current = up;
		
		x*=this.w;y*=this.h;
		w*=this.w;h*=this.h;
		bounds = new Rectangle(x,y,w,h);
	}
	
	public void press(){
		current = down;
	}
	
	public void release(){
		current = up;
	}
	
	public Texture getState(){
		return current;
	}
	
	
}
