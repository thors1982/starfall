package com.nstark.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.nstark.game.StarFallGame;
import com.nstark.game_objects.Ship;

public class GameScreen implements Screen
{
	private StarFallGame game;

	float screenWidth;
	float screenHeight;

	Ship ship;

	public GameScreen(StarFallGame game)
	{
		this.game = game;
	}
	
	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
	}
	
	@Override
	public void resize(int width, int height)
	{
		// TODO Auto-generated method stub
	}
	
	@Override
	public void show()
	{
		screenWidth = Gdx.graphics.getWidth();
		screenHeight = Gdx.graphics.getHeight();

		ship = new Ship(5, 8);
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
		// TODO Auto-generated method stub	
	}	
}
