package gameObject;

import gameObject.item.Inventory;
import util.Stats;

public class Enemy extends StatObject
{
	public static final float SIZE = 32;
	public static final int INV_SIZE = 2;
	protected float sightRange;
	protected float attackRange;
	
	protected GameObject target;

	public Enemy(float x, float y)
	{
		init(x, y, 1.0f, 0.1f, 0.25f, SIZE, SIZE, INV_SIZE, 52, 40);
	}
	public void init(float x, float y, float r, float g, float b, float sizeX, float sizeY, int inventorySize, float sightRange, float attackRange)
	{
		super.init(ID_ENEMY, x, y, r, g, b, sizeX, sizeY, inventorySize);
		this.sightRange = sightRange;
		this.attackRange = attackRange;
		
	}
	public void update()
	{
		if(target == null)
		{
			idol();
			look();

			return;
		}
		if(main.Physics.distance(this, target) < attackRange)
		{
			attack();
		}
		else
		{
			chase();
		}
		
	}
	protected void chase()
	{
		// TODO chase AI
		
	}
	protected void attack()
	{
		// TODO Attack AI
		
	}
	protected void idol()
	{
		// TODO Idol AI
		
	}
	protected void look()
	{
		// TODO add method for enemy to find player/target
		
	}
}
