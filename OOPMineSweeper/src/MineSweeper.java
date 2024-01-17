public class MineSweeper {
    Grid playingGrid;
    long startTime; // java.lang.System.currentTimeMillis()
    

    public MineSweeper() {
        playingGrid = new Grid();
        startTime = java.lang.System.currentTimeMillis();
    }
    public static void main(String[] args) throws Exception {
        MineSweeper game = new MineSweeper();
        System.out.println(game.playingGrid.toString());
    }
}
