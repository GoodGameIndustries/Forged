/**
 * 
 */
package com.GGI.UI.Toolbar;

import java.util.ArrayList;

import com.GGI.Assets.Assets;
import com.GGI.UI.Toolbar.ToolScreens.InventoryToolScreen;
import com.GGI.UI.Toolbar.ToolScreens.StatsToolScreen;

/**
 * @author Emmett Deen
 *
 */
public class Toolbar {
	public ArrayList<ToolTab> tabs = new ArrayList<ToolTab>();
	public Assets a;
	
	public Toolbar(Assets a){
		this.a=a;
		setup();
	}

	private void setup() {
		//add Settings
		//end add Settings
		
		//add Friends
		//end add Friends
		
		//add Map
		//end add Map
		
		//add Stats
		tabs.add(new ToolTab(a.statsTab,new StatsToolScreen(a)));
		//end add Stats
		
		//add Inventory
		tabs.add(new ToolTab(a.inventoryTab,new InventoryToolScreen(a)));
		//end add Inventory
		
	}
	
	
	
	
}
