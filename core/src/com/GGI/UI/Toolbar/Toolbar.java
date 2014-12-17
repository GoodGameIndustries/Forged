/**
 * 
 */
package com.GGI.UI.Toolbar;

import java.util.ArrayList;

import com.GGI.Assets.Assets;
import com.GGI.UI.Toolbar.ToolScreens.InventoryToolScreen;
import com.GGI.UI.Toolbar.ToolScreens.StatsToolScreen;
import com.GGI.UI.Toolset.StandardButtons;

/**
 * @author Emmett Deen
 *
 */
public class Toolbar {
	public Toolset toolSet = new StandardButtons();
	public Assets a;
	
	public Toolbar(Assets a){
		this.a=a;
		setup();
	}

	private void setup() {
		
	}
	
	
	
	
}
