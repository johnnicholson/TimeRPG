package gameObject;

import static org.lwjgl.opengl.GL11.*;
import util.Sprite;

public class GameObject
{
	protected float x, y;
	protected Sprite sprite;
	
	
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
	
	protected void init(float x, float y, float r, float g, float b, float sizeX, float sizeY)
	{
		this.x = x;
		this.y = y;
		this.sprite = new Sprite(r,g,b,sizeX, sizeY);

	}
}
