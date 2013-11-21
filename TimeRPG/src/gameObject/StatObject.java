package gameObject;

import util.Stats;

public class StatObject extends GameObject
{
	protected Stats stats;
	
	@Override
	public void init(float x, float y, float r, float g, float b, float sizeX, float sizeY)
	{
		super.init(x, y, r, g, b, sizeX, sizeY);
		stats = new Stats(80);
	}
}
