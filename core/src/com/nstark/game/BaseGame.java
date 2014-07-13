package com.nstark.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Sound;

public abstract class BaseGame extends Game
{
	private InputProcessor input;
	private Sound sound;

	public void setInput(InputProcessor input)
	{
		this.input = input;
		Gdx.input.setInputProcessor(input);
	}

	public void setSound(Sound sound)
	{
		this.sound = sound;
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
