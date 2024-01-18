import java.util.Arrays;

public class Grid {
	Cell[][] cellGridArray;

	public Grid(int width, int height) {
		cellGridArray = new Cell[width][height];
	}
	
	public String toString() {
		String builder = "";
		for (Cell[] CG: cellGridArray) {
			builder += Arrays.toString(CG);
		}
		return builder;
	}
}
