package BarrenMoor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String look, north, east, south, west, name;
		
		System.out.println(name + "You awaken to find yourself in a barren moor. Try “look”.");

		Scanner input = new Scanner(System.in);
		
		look = input.next();

		System.out.println("\n");

		System.out.println("Grey foggy clouds float oppressively close to you,\r\n"
				+ "reflected in the murky grey water which reaches up your\r\n" + "shins.\r\n" + "\n"
				+ "Some black plants barely poke out of the shallow water.\r\n"
				+ "Try “north”,”south”,”east”,or “west”.\n"
				+ "You notice a small watch-like device in your left hand.\r\n"
				+ "It has hands like a watch, but the hands don’t seem to tell time.");
		
		System.out.println("\n");
		
		
		Direction[] dArray = new Direction[4];
		dArray [0] = new Direction("You went north \n ");
		dArray [1] = new Direction("You went east \n");
		dArray [2] = new Direction("You went south \n");
		dArray [3] = new Direction("You went west \n");

		
	
//      Wanted an if statement for north, east, west, and south.
//      Each direction would've had a situation that the player 
//		comes across with different options but I just wasnt sure
//      how I would implement.
		
		
//		if(north.equalsIgnoreCase("north")) {
//			System.out.println(dArray[0].getNorth());
//		}
//		
		
		
		north = input.next();
		System.out.println(dArray[0].getNorth());
		east = input.next();
		System.out.println(dArray[0].getNorth());
		south = input.next();
		System.out.println(dArray[0].getNorth());
		west = input.next();
		System.out.println(dArray[0].getNorth());

	}

}
