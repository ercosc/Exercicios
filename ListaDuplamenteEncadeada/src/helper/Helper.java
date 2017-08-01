package helper;

import model.Lista;

public class Helper 
{
	
	public Helper()
	{
		Lista l = new Lista();
		
		l.push(10);
		l.push(20);
		l.mostrar();
		l.pop();
		l.mostrar();
	}

}
