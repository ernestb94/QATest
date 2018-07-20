package BarrenMoor;

// This is where I would have implemented different options for each direction that the player takes
// for example if the player heads South and inputs PROCEED then the player dies and the game ends
// however I wasnt sure how I would implemented it.


public class Direction {

	String north, east, south, west;

	public Direction(String getDirection) {

		this.north = getDirection;
		this.east = getDirection;
		this.south = getDirection;
		this.west = getDirection;

	}

	public String getNorth() {
		return north + "You wandered into a treasure box, however its locked. Do PROCEED or LEAVE?";
	}

	public String getEast() {
		return east + "You see a bear pre occupied with its food. Do you PROCEED or LEAVE";
	}

	public String getSouth() {
		return south + "You wandered to an Edge of a cliff with a nice view. Do you PROCEED or SEARCH?";
	}

	public String getWest() {
		return west + "You see a giant beehive. A stick is nearby, Do you GRAB or LEAVE the stick?";
	}
}
