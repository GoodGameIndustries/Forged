/**
 * 
 */
package com.GGI.Item.Weapon;

import com.GGI.Item.Item;
import com.badlogic.gdx.graphics.Texture;

/**
 * @author Emmett Deen
 *
 */
public class Weapon extends Item{

	public int material;
	public Weapon(String name, Texture texture, int material) {
		super(name, texture);
		this.material=material;
	}

}
