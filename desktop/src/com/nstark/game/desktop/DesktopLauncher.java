package com.nstark.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nstark.game.StarFallGame;

public class DesktopLauncher
{
	public static void main(String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "StarFall";
		config.useGL30 = false;
		config.width = 480;
		config.height = 854;

		new LwjglApplication(new StarFallGame(), config);
	}
}