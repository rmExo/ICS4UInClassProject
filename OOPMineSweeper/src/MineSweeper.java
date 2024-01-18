import java.util.Scanner;

public class Minesweeper {
	Grid playingGrid;

	public Minesweeper(String difficulty) {
		int width = 0, height = 0;
		switch (difficulty) {
			case "Easy":
			case "easy":
			case "Ea":
			case "ea":
				width = 10;
				height = 8;
				break;
			case "Hard":
			case "hard":
			case "H":
			case "h":
				width = 24;
				height = 20;
				break;
			case "Medium":
			case "medium":
			case "Med":
			case "med":
			case "M":
			case "m":
			default:
				width = 18;
				height = 14;
				break;
		}
		playingGrid = new Grid(width, height);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Minesweeper game = new Minesweeper(scan.nextLine());

		System.out.println(game.playingGrid);
	}
}
