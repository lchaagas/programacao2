package prog2;

public class Retangulo {
	private Ponto2D a;
	private Ponto2D b;

	
	public Retangulo() {
		this.a = new Ponto2D();
		this.b = new Ponto2D();
		
	}

	public Retangulo(Ponto2D a) {
		this.a = a;
		this.b = new Ponto2D();
		
	}
	
	public Retangulo(Ponto2D a, Ponto2D b) {
		this.a = a;
		this.b = b;		
	}
	
	public Retangulo(double a1, double a2, double b1, double b2) {
		this.a = new Ponto2D(a1, b1);
		this.b = new Ponto2D(a2, b2);
	}
	

	public void print() {
		System.out.println("Retangulo, pontos opostos:");
		a.print();
		b.print();
	}
	
	public Ponto2D getA() {
		return this.a;
	}
	
	public Ponto2D getB() {
		return this.b;
	}
	


}
