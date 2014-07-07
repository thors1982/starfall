package com.nstark.game_objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import com.nstark.enums.Room;

public class Ship
{
	private int width;
	private int height;
	private Map<Coordinate, Room> rooms;
	private ArrayList<Character> characters;
	private ArrayList<Item> loot;
	private ArrayList<Room> events;
	
	public Ship(int setWidth, int setHeight)
	{
		width = setWidth;
		height = setHeight;
		
		rooms = new HashMap<Coordinate, Room>();
		characters = new ArrayList<Character>();
		loot = new ArrayList<Item>();
		
		
		//Random in = new Random();
		//rooms.put(new Coordinate(0,0), Rooms.values()[in.nextInt(setHeight)]);
		//rooms.get(new Coordinate(in.nextInt(width), in.nextInt(height))).setItem()
	}
}
