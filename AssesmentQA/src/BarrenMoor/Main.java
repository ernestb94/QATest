package BarrenMoor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	   String look, north, east, south, west;

		System.out.println("You awaken to find yourself in a barren moor. Try “look”.");
		
		Scanner input = new Scanner(System.in);
		look = input.next();
		
		System.out.println("\n");
		
		
		
		System.out.println("Grey foggy clouds float oppressively close to you,\r\n"
				+ "reflected in the murky grey water which reaches up your\r\n" + "shins.\r\n"
				+ "\n"
				+ "Some black plants barely poke out of the shallow water.\r\n" + "Try “north”,”south”,”east”,or “west”.\n"
				+ "You notice a small watch-like device in your left hand.\r\n"
				+ "It has hands like a watch, but the hands don’t seem to tell time.");
		
		
		north = input.next();
	    System.out.println("you head north");
        east = input.next();
        System.out.println("you head east");
		south = input.next();
	    System.out.println("you head south");
        west = input.next();
        System.out.println("you head west");
		
		}
		
		
	

//		north = input.next();
//		System.out.println("you go north");
//		east = input.next();
//		System.out.println("you go east");

	}
