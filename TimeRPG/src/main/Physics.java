package main;

import gameObject.GameObject;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Physics
{
	public static float distance(GameObject go1, GameObject go2)
	{
		return (float)Math.sqrt((go1.getX() - go2.getX()) * (go1.getX() -go2.getX()) + (go1.getY() -go2.getY()) * (go1.getY() -go2.getY()));
	}
	public static boolean checkCollision(GameObject go1, GameObject go2)
	{
		Rectangle r1 = new Rectangle((int)go1.getX(),(int) go1.getY(), (int)go1.getSizeX(),(int) go1.getSizeY());
		Rectangle r2 = new Rectangle((int)go2.getX(),(int) go2.getY(), (int)go2.getSizeX(),(int) go2.getSizeY());
		return r1.intersects(r2);
	}
	public static ArrayList<GameObject> sphereCollision(GameObject go1, float radius)
	{
		
		ArrayList<GameObject> temp = new ArrayList<GameObject>();
		ArrayList<GameObject> gameObjs = Game.getGame().getObjects();
		for(GameObject go2 : gameObjs)
		{
			if(radius > distance(go1,go2))
			{
				temp.add(go2);
			}
		}
		return temp;
	}
	public static ArrayList<GameObject> rectangleCollision(float x, float y, float width, float height)
	{
		Rectangle r = new Rectangle((int)x,(int) y,(int) width,(int) height);
		ArrayList<GameObject> temp = new ArrayList<GameObject>();
		ArrayList<GameObject> gameObjs = Game.getGame().getObjects();
		for(GameObject go : gameObjs)
		{
			if(r.intersects(new Rectangle((int)go.getX(),(int) go.getY(), (int)go.getSizeX(),(int) go.getSizeY())))
			{
				temp.add(go);
			}
		}
		return temp;
	}
}
