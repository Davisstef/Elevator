package com.fdmgroup;

public class Command {

	private int current;
	private int next;

	public Command(int current, int next) {
		this.current = current;
		this.next = next;
	}
	
	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

}
