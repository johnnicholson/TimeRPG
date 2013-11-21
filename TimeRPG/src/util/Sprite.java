package util;

import static org.lwjgl.opengl.GL11.*;

public class Sprite
{
	private float r, g, b;
	
	private float sizeX, sizeY;
	
	public Sprite(float r, float g, float b, float sizeX, float sizeY)
	{
		this.r = r;
		this.g = g;
		this.b = b;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	
	public void render()
	{
		glColor3f(r,g,b);
		glBegin(GL_QUADS);
		{
			glVertex2f(0,0);
			glVertex2f(0,sizeY);
			glVertex2f(sizeX,sizeY);
			glVertex2f(sizeX,0);
		}
		glEnd();
	}

	public float getSizeX()
	{
		return sizeX;
	}

	public float getSizeY()
	{
		return sizeY;
	}


}
