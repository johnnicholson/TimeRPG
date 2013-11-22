package gameObject;

import gameObject.item.Item;

import java.util.ArrayList;

public class Enemy extends StatObject
{
	public static final float SIZE = 32;
	public static final int INV_SIZE = 2;
	protected float sightRange;
	protected float attackRange;
	
	protected StatObject target;
	private static float DAMPING = 0.5f;

	public Enemy(float x, float y)
	{
		init(x, y, 1.0f, 0.1f, 0.25f, SIZE, SIZE, INV_SIZE, 124, 48);
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
	protected void idol()
	{
		look();
		
	}
	protected void look()
	{
		ArrayList<GameObject> objs = main.Physics.sphereCollision(this, sightRange);
		for (GameObject go : objs)
		{
			if (go.getType() == ID_PLAYER) //TODO Add method of enemies attacking each others
			{
				target = (StatObject)go;
				break;
			}
		}
		
	}
	protected void chase()
	{
		float speedX = target.getX() -x;
		float speedY = target.getY() - y;
		
		float maxSpeed = getSpeed() * DAMPING;
		
		if(speedX > maxSpeed)
			speedX = maxSpeed;
		if(speedX < -maxSpeed)
			speedX = -maxSpeed;
		if(speedY > maxSpeed)
			speedY = maxSpeed;
		if(speedY < -maxSpeed)
			speedY = -maxSpeed;
		
		x += speedX;
		y += speedY;
	}
	protected void attack()
	{
		// TODO Attack AI
		
	}

}
