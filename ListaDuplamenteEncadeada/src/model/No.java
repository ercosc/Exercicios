package model;

public class No {
	private Object element;
	private No next;
	private No prev;
	
	
	
	public No(Object element){
	this.setElement(element);
	this.setNext(null);
	this.setPrev(null);
	}
	
	
	
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public No getNext() {
		return next;
	}
	public void setNext(No next) {
		this.next = next;
	}
	public No getPrev() {
		return prev;
	}
	public void setPrev(No prev) {
		this.prev = prev;
	}
}