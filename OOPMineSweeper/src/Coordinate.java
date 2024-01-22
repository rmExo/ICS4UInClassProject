public class Coordinate {
	int x, y;

	public Coordinate (int x, int y) {
		setX(x);
		setY(y);
	}

	public String toString () {
		return x + ", " + y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

}
