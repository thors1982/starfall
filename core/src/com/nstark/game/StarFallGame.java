package com.nstark.game;

import com.nstark.Inputs.GameInput;
import com.nstark.Inputs.SplashInput;
import com.nstark.assets.Textures;
import com.nstark.enums.ScreenType;
import com.nstark.screens.GameScreen;
import com.nstark.screens.SplashScreen;

import static com.nstark.enums.ScreenType.SPLASH;

public class StarFallGame extends BaseGame
{
	@Override
	public void create()
	{
		Textures.load();

		changeScreen(SPLASH);
	}

	public void changeScreen(ScreenType screen)
	{
		switch(screen)
		{
			case SPLASH:
				setScreen(new SplashScreen(this));
				setInput(new SplashInput(this));
				//setSound(new SplashSound(this));
				break;
			case GAME:
				setScreen(new GameScreen(this));
				setInput(new GameInput(this));
				break;
			default:
				throw new IllegalArgumentException("");
		}
	}
}
