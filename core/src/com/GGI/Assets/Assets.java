/**
 * 
 */
package com.GGI.Assets;

import sun.font.TrueTypeFont;

import com.GGI.Forged.Forged;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeBitmapFontData;

/**
 * @author Emmett Deen
 *
 */
public class Assets {

	public Forged f;
	
	/**Tool Tab Textures*/public Texture inventoryTab,statsTab;
	/**Stats Textures*/public Texture attack,strength,defense,health,woodCutting,cooking,fishing,mining,forging,gathering;
	/**UI Textures*/public TextureRegion textBox;
	
	/**Databases*/
	public Stats stats;
	public Inventory inventory;
	
	/**Font**/
	public BitmapFont font;
	public static final String FONT_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\/?-+=()*&.;,{}\"´`'<>";
	
	
	public Assets(Forged f){
		this.f=f;
		
		//initialize font
		
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("Neou-Thin.ttf"));
		
		font = generator.generateFont(150,FONT_CHARACTERS,false);
		generator.dispose();
		font.setColor(1,1,1,1);
		
		/**Load UI*/
		textBox = new TextureRegion(new Texture(Gdx.files.internal("UI/TextBox.png")));
		
	}
	
}
