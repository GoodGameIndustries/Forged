/**
 * 
 */
package com.GGI.creature;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * @author Emmett Deen
 *
 */
public class Creature {

	public int health;
	public int lv;
	public String name;
	public Rectangle bounds;
	
	public Creature(String name,int health,int lv,float x,float y,float w,float h){
		this.name=name;
		this.health=health;
		this.lv = lv;
		this.bounds=new Rectangle(x,y,w,h);
	}
	
}
