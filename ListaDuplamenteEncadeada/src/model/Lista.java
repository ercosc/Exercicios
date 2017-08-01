package model;

public class Lista {
	private No first;
	private No last;
	private int size;
	
	public Lista()
	{
		this.setFirst(null);
		this.setLast(null);
		this.setSize(0);
	}
	
	private boolean isEmpty()
	{
		return this.getFirst() == null && this.getLast() == null && this.getSize() == 0;
	}
	
	public void push(Object element)
	{
		No node = new No(element);
		this.setSize(++size);
		
		node.setNext(this.getFirst());
		this.setFirst(node);
	}
	
	public Object pop()
	{
		Object element = null;
		if(this.isEmpty())
		{
			System.out.println("a fila está vazia");
		}else{
			this.setFirst(this.getFirst().getNext());
			this.setSize(--size);
		}
		
		
		return element;
	}
	
	public void mostrar()
	{
		
		No no = this.getFirst();
		String concat = "A lista está vazia";
		
		if(!this.isEmpty())
		{
			concat = "";	
		
			while(no != null)
			{
				concat += no.getElement() + " - ";
				no = no.getNext();
			}
			System.out.println(concat);
		}
	}

	
	public No getFirst() {
		return first;
	}
	public void setFirst(No first) {
		this.first = first;
	}
	public No getLast() {
		return last;
	}
	public void setLast(No last) {
		this.last = last;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
