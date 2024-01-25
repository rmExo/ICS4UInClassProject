import java.util.Arrays;

public class Grid {
	Cell[][] cellGridArray;
	byte xBomb;
	byte yBomb;

	public Grid(int width, int height, int numMines) {
		cellGridArray = new Cell[width][height];
		for (int i = 0; i < cellGridArray.length; i++) {
			for (int k = 0; k < cellGridArray[i].length; k++) {
				cellGridArray[i][k] = new Cell();
			}
		}
		for(int i =0; i<numMines; i++){
			xBomb = (byte) ((int)(Math.random()*width)+1);
			yBomb = (byte) ((int)(Math.random()*height)+1);
			System.out.println(xBomb + " " + yBomb + " " +i);
			if(cellGridArray[xBomb-1][yBomb-1].getMine() == false){
				cellGridArray[xBomb-1][yBomb-1].setMine();
			}
			else{
				i--;
			}
		}
	}
	public String toString() {
		String builder = "";
		for (Cell[] CG: cellGridArray) {
			builder += Arrays.toString(CG) + "\n";
		}
		return builder;
	}
}
