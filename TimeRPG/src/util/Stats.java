package util;

public class Stats
{
	private int exp;
	private int health;
	private final static int LEVEL_CONST = 3;
	
	public Stats(int exp)
	{
		this.exp = exp;
		health = getMaxHealth();
	}
	public int getLevel()
	{
		return (int)Math.sqrt(exp)/LEVEL_CONST + 1;
	}
	public int getMaxHealth()
	{
		return getLevel() * 10;
	}
	public int getHealth()
	{
		if(health > getMaxHealth())
			health = getMaxHealth();
		return health;
	}
	public int getStreangth()
	{
		return getLevel() * 2;
	}
	public void exp(int ex)
	{
		exp += ex;
	}
	public float getSpeed()
	{
		return (getLevel() + 32)/10;
	}
}
