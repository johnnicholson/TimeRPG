package main;

import gameObject.GameObject;
import gameObject.Player;

import java.util.ArrayList;

import org.lwjgl.opengl.Display;

public class Game
{
	private ArrayList<GameObject> objects;
	
	Player player;
	
	public Game()
	{
		objects = new ArrayList<GameObject>();
		player = new Player(Display.getWidth()/2 - Player.SIZE/2,Display.getHeight()/2 - Player.SIZE/2);
		objects.add(player);
	}
	public void getInput()
	{
		player.getInput();
	}
	public void update()
	{
		for(GameObject go: objects)
		{
			go.update();
		}
	}

	public void render()
	{
		for(GameObject go: objects)
		{
			go.render();
		}
	}
}
