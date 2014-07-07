package com.nstark.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nstark.assets.Textures;
import com.nstark.game.StarFallGame;

public class SplashScreen implements Screen
{
	private StarFallGame game;

	private SpriteBatch batcher;

	float screenWidth;
	float screenHeight;

	public SplashScreen(StarFallGame game)
	{
		this.game = game;
	}

	@Override
	public void show()
	{
		screenWidth = Gdx.graphics.getWidth();
		screenHeight = Gdx.graphics.getHeight();

		batcher = new SpriteBatch();
	}

	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);

		batcher.begin();

		batcher.draw(Textures.logo, screenWidth / 2 - Textures.logo.getWidth() / 2, screenHeight / 2 - Textures.logo.getHeight() / 2);
		batcher.end();

		if(Gdx.input.justTouched())
		{
			game.setScreen(new GameScreen());
		}
	}

	@Override
	public void resize(int width, int height)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void hide()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void pause()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void resume()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose()
	{
		batcher.dispose();
	}
}
