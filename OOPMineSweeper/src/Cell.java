public class Cell {
	boolean isVisible, isMine, isFlagged;
	byte nearbyMines;

	public Cell() {
		this.isVisible = false;
		this.isMine = false;
		this.isFlagged = false;
	}

	public void setMine() {
		this.isMine = true;
	}
	public boolean getMine(){
		return this.isMine;
	}
	public void setFlagged(){
		this.isFlagged = true;
	}
	public void getFlagged(){
		this.isFlagged = true;
	}

	public String toString() {
		if(isMine == true){
			return "!";
		}
		else {
			return ".";
		}
		// TODO implement actual render
	}
}
