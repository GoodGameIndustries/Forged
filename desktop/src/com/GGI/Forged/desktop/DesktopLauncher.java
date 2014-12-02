package com.GGI.Forged.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.GGI.Forged.Forged;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		 cfg.width = 1200;
	     cfg.height = 675;
		new LwjglApplication(new Forged(), cfg);
	}
}
