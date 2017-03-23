package org.ivan.mybatis.domain;

import java.io.Serializable;

/**
 * Created by Ivan.Luo
 * Date: 3/10/2017 10:24 AM
 */
public class User implements Serializable
{
	private int id;
	private String name;

	public User(){}

	public User(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "[id: "+this.id+", name: "+name+"]";
	}
}
