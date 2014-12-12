/**
 * 
 */
package com.GGI.Assets;

import java.util.ArrayList;

import com.GGI.Forged.Forged;
import com.GGI.UI.Button.Button;
import com.GGI.creature.Me;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

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
	public Bank bank;
	
	/**Font**/
	public BitmapFont font;
	public static final String FONT_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\/?-+=()*&.;,{}\"´`'<>";
	
	/**Buttons*/
	public Button login;
	public Button createAccount;
	public Button hairColorRight;
	public Button hairColorLeft;
	public Button hairRight;
	public Button hairLeft;
	public Button skinRight;
	public Button skinLeft;
	public Button chestRight;
	public Button chestLeft;
	public Button legsRight;
	public Button legsLeft;
	public Button back;
	public Button createCharacter;
	
	/**Animations*/
	public Texture particle;
	
	/**Me*/
	public Me me;
	
	/**Arrays of human components*/
	public Texture[][] hair;//x = hair color y = hair style;
	public Texture[] skin;
	public Texture[] chest;
	public Texture[] legs;
	
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
		login = new Button("UI/Buttons/loginUp.png","UI/Buttons/loginDown.png",.45f,.18f,.1f,.08f);
		createAccount = new Button("UI/Buttons/createAccountUp.png","UI/Buttons/createAccountDown.png",.45f,.08f,.1f,.08f);
		hairColorRight=new Button("UI/Buttons/rightArrowUp.png","UI/Buttons/rightArrowDown.png",.8f,.7f,.1f,.1f);
		hairColorLeft=new Button("UI/Buttons/leftArrowUp.png","UI/Buttons/leftArrowDown.png",.4f,.7f,.1f,.1f);
		hairRight=new Button("UI/Buttons/rightArrowUp.png","UI/Buttons/rightArrowDown.png",.8f,.6f,.1f,.1f);
		hairLeft=new Button("UI/Buttons/leftArrowUp.png","UI/Buttons/leftArrowDown.png",.4f,.6f,.1f,.1f);
		skinRight=new Button("UI/Buttons/rightArrowUp.png","UI/Buttons/rightArrowDown.png",.8f,.5f,.1f,.1f);
		skinLeft=new Button("UI/Buttons/leftArrowUp.png","UI/Buttons/leftArrowDown.png",.4f,.5f,.1f,.1f);
		chestRight=new Button("UI/Buttons/rightArrowUp.png","UI/Buttons/rightArrowDown.png",.8f,.4f,.1f,.1f);
		chestLeft=new Button("UI/Buttons/leftArrowUp.png","UI/Buttons/leftArrowDown.png",.4f,.4f,.1f,.1f);
		legsRight=new Button("UI/Buttons/rightArrowUp.png","UI/Buttons/rightArrowDown.png",.8f,.3f,.1f,.1f);
		legsLeft=new Button("UI/Buttons/leftArrowUp.png","UI/Buttons/leftArrowDown.png",.4f,.3f,.1f,.1f);
		back=new Button("UI/Buttons/backUp.png","UI/Buttons/backDown.png",.3f,.1f,.1f,.08f);
		createCharacter = new Button("UI/Buttons/createCharacterUp.png","UI/Buttons/createCharacterDown.png",.4f,.1f,.1f,.08f);
		
		/**Load Animations*/
		particle=new Texture(Gdx.files.internal("Animations/Particle.png"));
		
		/**Load Arrays of human components*/
			//hair
		hair = new Texture[5][6];
		for(int i = 1; i<=5;i++){
			for(int j = 1; j<=6;j++){
				hair[i-1][j-1] = new Texture(Gdx.files.internal("Player/Front/Hair/Color"+i+"/Hair"+j+".png"));
			}
		}
			//skin
		skin = new Texture[6];
		for(int i = 1; i <= 6;i++){
			skin[i-1]=new Texture(Gdx.files.internal("Player/Front/Skin/Skin"+i+".png"));
		}
			//chest
		chest = new Texture[10];
		for(int i = 1; i <= 10; i++){
			chest[i-1]=new Texture(Gdx.files.internal("Player/Front/Torso/Torso"+i+".png"));
		}
		
			//pants
		legs = new Texture[10];
		for(int i = 1; i <= 10; i++){
			legs[i-1]=new Texture(Gdx.files.internal("Player/Front/Legs/Pant"+i+".png"));
		}
	}
	
}
