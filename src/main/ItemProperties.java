package main;

/**
 * Created by Anna on 01/11/2015.
 */
public class ItemProperties
{
	public ItemProperties(String id, int level, String context, int value)
	{
		this.id = id;
		this.level = level;
		this.context = context;
		this.value = value;
	}

	public String buildMapKey()
	{
		return id + ":" + level + ":" + context;
	}

	@Override
	public String toString()
	{
		return id + ":" + level + ":" + context + ":" + value;
	}

	String id;
	int    level;
	String context;
	int    value;
}