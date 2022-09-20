package com.fdmgroup;

public class Elevator extends Thread{

	private int floor;
	private Thread thread;
	
	
	public Elevator() {
		this.floor = 0;
		Runnable r = new Runnable(){ 
		    @Override
		    public void run(){
		    	
		    }
		}; 
		this.thread = new Thread(r);
	}

	public int getCurrentFloor() {
		return floor;
	}
	
	public void setCurrentFloor(int floor) {
		this.floor = floor;
	}

}
