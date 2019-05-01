package jpgalovic.robonav.container;

public class Coordinate {
	public int x, y;
	
	public void set(Coordinate other) {
		this.x = other.x;
		this.y = other.y;
	}
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		
		if(!(o instanceof Coordinate))
			return false;
		
		Coordinate c = (Coordinate) o;
		
		return this.x == c.x && this.y == c.y;
	}
}
