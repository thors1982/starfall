package com.nstark.assets;

import com.badlogic.gdx.graphics.Texture;

public class Textures
{
	public static Texture logo;
	
	public static void load()
	{
		logo = new Texture("images/logo.png");
		
	}
	
	public static void dispose()
	{
		logo.dispose();
	}
}
