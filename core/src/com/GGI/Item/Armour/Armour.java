package com.GGI.Item.Armour;

import com.GGI.Item.Item;
import com.badlogic.gdx.graphics.Texture;

public class Armour extends Item{
	public int material;
	
	public Armour(String name, Texture texture,int material){
		super(name,texture);
		this.material=material;
	}
	
}
