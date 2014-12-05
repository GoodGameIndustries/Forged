package com.GGI.Item.Food;

import com.GGI.Item.Item;
import com.badlogic.gdx.graphics.Texture;

public class Food extends Item{
	
	protected int regain = 0;
		
	public Food(String name, Texture texture, int regain) {
		super(name, texture);
		this.regain=regain;
	}

}
