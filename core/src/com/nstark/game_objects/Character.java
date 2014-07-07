package com.nstark.game_objects;

import java.util.ArrayList;

import com.nstark.enums.CharacterMovementType;

public class Character
{
	private int roomId;
	private String name;
	private CharacterMovementType movement;
	private ArrayList<Item> items;
	
	public Character()
	{
		movement = CharacterMovementType.STRAIGHT;
	}
}
