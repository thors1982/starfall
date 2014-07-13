package com.nstark.Inputs;

import com.badlogic.gdx.InputProcessor;
import com.nstark.game.StarFallGame;
import com.nstark.enums.ScreenType;

public class SplashInput implements InputProcessor
{
	private StarFallGame game;

	public SplashInput(StarFallGame game)
	{
		this.game = game;
	}

	@Override
	public boolean keyDown(int keycode)
	{
		return false;
	}

	@Override
	public boolean keyUp(int keycode)
	{
		return false;
	}

	@Override
	public boolean keyTyped(char character)
	{
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{
		game.changeScreen(ScreenType.GAME);
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer)
	{
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY)
	{
		return false;
	}

	@Override
	public boolean scrolled(int amount)
	{
		return false;
	}
}
