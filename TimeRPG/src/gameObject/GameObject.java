package gameObject;

import static org.lwjgl.opengl.GL11.*;
import util.Sprite;

public class GameObject
{
	public static final int ID_PLAYER = 1;
	public static final int ID_ENEMY = 2;
	public static final int ID_ITEM = 3;
	
	public static final int FLAG_REMOVE = 0;
	private boolean[] flags = new boolean[1];
	
	protected float x, y;
	protected Sprite sprite;
	protected int type;
	
	
	public void update()
	{
		
	}

	public void render()
	{
		glPushMatrix();
		{
			glTranslatef(x, y, 0);
			sprite.render();
		}
		glPopMatrix();
	}
	
	protected void init(int type, float x, float y, float r, float g, float b, float sizeX, float sizeY)
	{
		this.x = x;
		this.y = y;
		this.sprite = new Sprite(r,g,b,sizeX, sizeY);
		this.type = type;

	}
	
	protected void remove()
	{
		flags[FLAG_REMOVE] = true;
	}
	
	public boolean[] getFlags()
	{
		return flags;
	}
	
	public float getX()
	{
		return x;
	}

	public float getY()
	{
		return y;
	}

	public float getSizeX()
	{
		return sprite.getSizeX();
	}

	public float getSizeY()
	{
		return sprite.getSizeX();
	}

	public int getType()
	{
		return type;
	}
}
