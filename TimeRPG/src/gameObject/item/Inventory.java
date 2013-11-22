package gameObject.item;

public class Inventory
{
	private Item[] items;
	private int firstOpen;

	public Inventory(int size)
	{
		items = new Item[size];
		firstOpen = 0;

	}

	public boolean addItem(Item item)
	{
		if (firstOpen < items.length)
		{
			items[firstOpen] = item;
			while (firstOpen < items.length)
			{
				firstOpen++;
				if (items[firstOpen] == null)
				{
					break;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param index
	 *            the index to remove from
	 * @return null if out of bounds
	 */
	public Item removeItem(int index)
	{
		if (index < firstOpen)
			firstOpen = index;
		Item temp = items[index];
		items[index] = null;
		return temp;
	}
	public int getSize()
	{
		return items.length;
	}

}
