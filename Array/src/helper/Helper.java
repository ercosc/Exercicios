package helper;

import model.ArrayA;

public class Helper 
{
	private ArrayA array;
	
	public Helper()
	{
		this.array = new ArrayA();
		this.array.getArray()[0] = 10;
		this.array.getArray()[1] = 1;
		this.array.getArray()[2] = 10;
		this.array.getArray()[3] = 10;
		this.array.getArray()[4] = 6;
		this.array.getArray()[5] = 1;
		this.array.getArray()[6] = 9;
		this.array.getArray()[7] = 10;
		this.array.getArray()[8] = 1;
		this.array.getArray()[9] = 1;
		
		this.mostrarArray();
		
		System.out.println("-------------");
		this.array.reverterArray(this.array);
		this.array.modaArray(this.array);
		this.mostrarArray();
		
		
	}
	
	private void mostrarArray()
	{
		System.out.println(this.array.getArray()[0] + "-" + this.array.getArray()[1] + "-" +
						   this.array.getArray()[2] + "-" + this.array.getArray()[3] + "-" +
						   this.array.getArray()[4] + "-" + this.array.getArray()[5] + "-" +
						   this.array.getArray()[6] + "-" + this.array.getArray()[7] +"-" +
						   this.array.getArray()[8] + "-" + this.array.getArray()[9]);
	}
}
