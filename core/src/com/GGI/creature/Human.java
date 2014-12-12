package com.GGI.creature;

import com.badlogic.gdx.graphics.Texture;

public class Human extends Creature{
	
	public Texture hair;
	public Texture skin;
	public Texture chest;
	public Texture legs;

	public Human(String name, int health, int lv,Texture hair,Texture skin,Texture chest,Texture legs,float x,float y,float w,float h) {
		super(name, health, lv, x, y, w, h);
		this.hair=hair;
		this.skin=skin;
		this.chest=chest;
		this.legs=legs;
	}

}
