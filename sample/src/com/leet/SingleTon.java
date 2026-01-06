package com.leet;

public class SingleTon {

	
	private static SingleTon instance;
	
	public static SingleTon getSingleton()
	{
		if(instance== null)
		{
			synchronized (SingleTon.class) {
				
				if(instance==null)
				{
					instance= new SingleTon();
				}
			}
		}
		return instance;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
