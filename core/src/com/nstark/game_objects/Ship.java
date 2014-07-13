package com.nstark.game_objects;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ship
{
	private int width;
	private int height;
	private Map<Point, Room> rooms;
	private ArrayList<Character> characters;
	private ArrayList<Item> loot;
	private ArrayList<Room> events;
	
	public Ship(int setWidth, int setHeight)
	{
		width = setWidth;
		height = setHeight;

		rooms = new HashMap<Point, Room>();
		characters = new ArrayList<Character>();
		loot = new ArrayList<Item>();

		//Todo replace this (this is just a temp way to create a map with rooms)
		int count = 0;
		for(int x=0; x<width; x++)
		{
			for(int y=0; y<height; y++)
			{
				count++;
				Point p = new Point(x,y);
				Room r = new Room();
				r.setName("Room" + count);
				rooms.put(p, r);
			}
		}
		//Random in = new Random();
		//rooms.put(new Coordinate(0,0), Rooms.values()[in.nextInt(setHeight)]);
		//rooms.get(new Coordinate(in.nextInt(width), in.nextInt(height))).setItem()
	}
}
