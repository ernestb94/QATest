package BarrenMoor;

public class Direction {

	String north, east, south, west;

	public Direction(String getDirection) {

		this.north = getDirection;
		this.east = getDirection;
		this.south = getDirection;
		this.west = getDirection;

	}

	public String getNorth() {
		return north + "heading north";
	}

	public String getEast() {
		return east + "heading east";
	}

	public String getSouth() {
		return south + "heading south";
	}

	public String getWest() {
		return west + "heading west";
	}
}
