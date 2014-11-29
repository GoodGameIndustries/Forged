/**
 * 
 */
package com.GGI.Assets;

import com.GGI.Forged.Forged;
import com.badlogic.gdx.graphics.Texture;

/**
 * @author Emmett Deen
 *
 */
public class Assets {

	public Forged f;
	
	/**Tool Tab Textures*/public Texture inventoryTab,statsTab;
	/**Stats Textures*/public Texture attack,strength,defense,health,woodCutting,cooking,fishing,mining,forging,gathering;
	
	/**Databases*/
	public Stats stats;
	public Inventory inventory;
	
	public Assets(Forged f){
		this.f=f;
		
	}
	
}
