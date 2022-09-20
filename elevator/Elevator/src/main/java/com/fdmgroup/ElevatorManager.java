package com.fdmgroup;

import java.util.ArrayList;

public class ElevatorManager {
	
	private ArrayList<Elevator> elevators;
	private ArrayList<Command> commands;

	public ElevatorManager() {
		elevators = new ArrayList<Elevator>();
		commands = new ArrayList<Command>();
	}

	public ArrayList<Elevator> getElevators() {
		return elevators;
	}
	
	public void addElevator(Elevator elevator) {
		elevators.add(elevator);
	}

	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void assignCommands() { 
		while(commands.size() != 0) {
			for(Elevator e : elevators) {
				synchronized(this){
					e.setCurrentFloor(commands.get(0).getCurrent());
					try {
						e.sleep(5000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					e.setCurrentFloor(commands.get(0).getNext());
					try {
						e.sleep(5000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					commands.remove(0);
				}
			}
		}
		
	}
	
	public void startElevators() { 
		for(Elevator e : elevators) {
			e.start();
		}
	}

}
