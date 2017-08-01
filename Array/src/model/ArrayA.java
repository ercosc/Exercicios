package model;

public class ArrayA 
{
	private int[] array;
	
	public ArrayA()
	{
		this.array = new int[10];
	}
	
	public int[] getArray()
	{
		return this.array;
	}
	
	public void reverterArray(ArrayA array)
	{
		int i = 0;
		while( i < array.getArray().length/2)
		{
			int a = array.getArray()[i];
			int b = array.getArray()[array.getArray().length-1-i];
			
			array.getArray()[i] = b;
			array.getArray()[array.getArray().length-1-i] = a;
			i++;
		}
	}
	public void modaArray(ArrayA array)
	{
		int maxVezes = 0;
		int moda = 0;
		int novaModa = 0;
		
		for(int i = 0; i< array.array.length; i++)
		{	
			int nVezes = 0;
			
			for(int j = 0; j< array.array.length; j++)
			{
				if(array.array[i] == array.array[j])
				{
					nVezes++;
				}
			}
			if(nVezes > maxVezes)
			{
				maxVezes = nVezes;
				moda = array.array[i];
			} 
			else if(nVezes == maxVezes)
			{
				novaModa = array.array[i];
				
			}
		}
		if(Math.random() * 2 <= 1)
		System.out.println("a moda é: " + moda + " que se repete " + maxVezes + " vezes.");
		else
		System.out.println("a moda é: " + novaModa + " que se repete " + maxVezes + " vezes.");
	}
	
}
