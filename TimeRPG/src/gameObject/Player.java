package gameObject;

import gameObject.item.Item;

import java.util.ArrayList;

import main.Physics;

import org.lwjgl.input.Keyboard;

public class Player extends StatObject
{
	public static final float SIZE = 32;
	public static final int INV_SIZE = 8;

	public Player(float x, float y)
	{
		init(ID_PLAYER, x, y, 0.1f, 1.0f, 0.25f, SIZE, SIZE, INV_SIZE);
	}

	@Override
	public void update()
	{
		ArrayList<GameObject> objs = Physics.rectangleCollision(x, y, getSizeX(), getSizeY());
		for (GameObject go : objs)
		{
			if (go.getType() == ID_ITEM)
			{
				if (addItem((Item) go) == true) go.remove();
			}
		}
	}

	public void getInput()
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_W))
		{
			move(0, 1);
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_S))
		{
			move(0, -1);
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_A))
		{
			move(-1, 0);
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_D))
		{
			move(1, 0);
		}

	}

	private void move(float magX, float magY)
	{
		x += getSpeed() * magX;
		y += getSpeed() * magY;
	}



}
