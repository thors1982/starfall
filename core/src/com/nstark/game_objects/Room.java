package com.nstark.game_objects;

import com.nstark.enums.RoomStatus;

public class Room
{
	private int id;
	private String name;
	private RoomStatus currentStatus;
	private boolean requiredForWin;
	//image?
	
	private Integer repairItemId = null;
	
	public Room()
	{
		currentStatus = RoomStatus.SAFE;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
