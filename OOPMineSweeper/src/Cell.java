public class Cell {
	boolean isVisible, isMine, isFlagged;
	byte nearbyMines;

	public Cell() {
		
	}
	
	public String toString() {
		return ".";
		// TODO implement actual render
	}
}
