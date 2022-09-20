package com.fdmgroup;

public class Main {
	
	public static void main(String[] args) {
		int numLifts = 3;
		int maxFloor = 10;
		ElevatorManager manager = new ElevatorManager();
		for(int i = 0; i < numLifts; i++) {
			manager.addElevator(new Elevator());
		}
		manager.addCommand(new Command(3, 5));
		manager.addCommand(new Command(7, 1));
		manager.addCommand(new Command(5, 10));
		manager.addCommand(new Command(2, 1));
		new ElevatorFrameView(numLifts, maxFloor, manager);
		manager.assignCommands();
		manager.startElevators();
	}

}
