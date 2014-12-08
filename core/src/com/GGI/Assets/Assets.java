/**
 * 
 */
package com.GGI.Assets;

import sun.font.TrueTypeFont;

import com.GGI.Forged.Forged;
import com.GGI.UI.Button.Button;
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
	
	/**Buttons*/
	public Button login;
	public Button createAccount;
	
	
	public Assets(Forged f){
		this.f=f;
		
		//initialize font
		
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("Neou-Bold.ttf"));
		
		font = generator.generateFont(150,FONT_CHARACTERS,false);
		generator.dispose();
		font.setColor(1,1,1,1);
		
		/**Load UI*/
		textBox = new TextureRegion(new Texture(Gdx.files.internal("UI/TextBox.png")));
		
		/**Load Buttons*/
		login = new Button("UI/Buttons/loginUp.png","UI/Buttons/loginDown.png",.45f,.21f,.1f,.08f);
		createAccount = new Button("UI/Buttons/createAccountUp.png","UI/Buttons/createAccountDown.png",.45f,.11f,.1f,.08f);
		
	}
	
}
