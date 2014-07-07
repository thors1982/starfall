package com.nstark.game;

import com.badlogic.gdx.Game;
import com.nstark.assets.Textures;
import com.nstark.screens.SplashScreen;

public class StarFallGame extends Game
{
	@Override
	public void create()
	{
		Textures.load();

		this.setScreen(new SplashScreen(this));
	}

	@Override
	public void render()
	{
		super.render();
	}

	@Override
	public void dispose()
	{
		super.dispose();
	}
}
