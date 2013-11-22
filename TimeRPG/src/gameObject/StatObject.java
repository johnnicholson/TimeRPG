package gameObject;

import gameObject.item.Inventory;
import gameObject.item.Item;
import util.Stats;

public class StatObject extends GameObject
{
	protected Stats stats;
	protected Inventory inv;
	
	public void init(int type, float x, float y, float r, float g, float b, float sizeX, float sizeY, int inventorySize)
	{
		super.init(type, x, y, r, g, b, sizeX, sizeY);
		stats = new Stats(0);
		inv = new Inventory(inventorySize);
	}
	public float getSpeed()
	{
		return stats.getSpeed();
	}

	public int getLevel()
	{
		return stats.getLevel();
	}

	public int getMaxHealth()
	{
		return stats.getMaxHealth();
	}

	public int getHealth()
	{
		return stats.getHealth();
	}

	public int getStreangth()
	{
		return stats.getStreangth();
	}

	public void exp(int ex)
	{
		stats.exp(ex);
	}

	public boolean addItem(Item item)
	{
		return inv.addItem(item);
	}

	public Item removeItem(int index)
	{
		return inv.removeItem(index);
	}

	public int getSize()
	{
		return inv.getSize();
	}
}
