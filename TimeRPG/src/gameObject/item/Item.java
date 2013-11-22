package gameObject.item;

import gameObject.GameObject;

public class Item extends GameObject
{
	protected String name;
	public void pickUp()
	{
		remove();
	}
	protected void init(float x, float y, float r, float g, float b, float sizeX, float sizeY, String name)
	{
		super.init(ID_ITEM, x, y, r, g, b, sizeX, sizeY);
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
