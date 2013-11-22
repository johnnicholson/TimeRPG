package main;

import gameObject.GameObject;
import gameObject.Player;
import gameObject.item.Cube;

import java.util.ArrayList;

import org.lwjgl.opengl.Display;

public class Game
{
	private ArrayList<GameObject> objects;
	private Player player;
	private static Game game;
	
	private Game()
	{
		objects = new ArrayList<GameObject>();
		player = new Player(Display.getWidth()/2 - Player.SIZE/2,Display.getHeight()/2 - Player.SIZE/2);
		objects.add(player);
		objects.add(new Cube(50,20));
	}
	
	public void getInput()
	{
		player.getInput();
	}
	public ArrayList<GameObject> getObjects()
	{
		return objects;
	}
	public void render()
	{
		for(GameObject go: objects)
		{
			go.render();
		}
	}
	public void update()
	{
		for(int index = 0; index < objects.size(); index++)
		{
			objects.get(index).update();
			boolean[] flags = objects.get(index).getFlags();
			if(flags[GameObject.FLAG_REMOVE] == true)
			{
				objects.remove(index);
				index--;
			}
		}
	}

	public static Game getGame()
	{
		if(game == null)
		{
			game = new Game();
		}
		return game;
	}
}
