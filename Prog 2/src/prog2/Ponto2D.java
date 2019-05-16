package prog2;

public class Ponto2D {
	private double x;
	private double y;
	
	public Ponto2D() {
		this.x = 0;
		this.y = 0;		
	}
	
	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;		
	}
	
	public void print() {
		System.out.println("X: "+this.x+" Y: "+this.y);
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
}
