package gameObject.item;

public class Cube extends Item
{
	public static final int SIZE = 32;
	public Cube(float x, float y)
	{
		this.init(x, y, 0, 0, 0.5f, SIZE,SIZE, "Cube");
	}
}
