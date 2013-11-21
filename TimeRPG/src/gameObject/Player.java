package gameObject;

import org.lwjgl.input.Keyboard;


public class Player extends StatObject
{
	public static final float SIZE = 32;
	
	
	
	public Player(float x, float y)
	{
		super();
		init(x,y,0.1f, 1.0f, 0.25f, SIZE, SIZE);
	}
	
	@Override
	public void update()
	{
		System.out.println("Level: " + stats.getLevel() + "Health: " + stats.getHealth() + "/" + stats.getMaxHealth());
	}

	public void getInput()
	{
		if(Keyboard.isKeyDown(Keyboard.KEY_W))
		{
			move(0,1);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_S))
		{
			move(0,-1);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_A))
		{
			move(-1,0);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_D))
		{
			move(1,0);
		}
		
	}
	private void move(float magX, float magY)
	{
		x += getSpeed() * magX;
		y += getSpeed() * magY;
	}
	
	public float getSpeed()
	{
		return 4f;
	}

}
