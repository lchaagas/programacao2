package prog2;

import org.junit.Test;

public class RetanguloTest {

	@Test
	public void retanguloTest() {
		Retangulo ret1 = new Retangulo();
		ret1.print();			
		
		Retangulo ret2 = new Retangulo(new Ponto2D(3,5));
		ret2.print();
		
		Retangulo ret3 = new Retangulo(new Ponto2D(3,5), new Ponto2D(6,7));
		ret3.print();		
		
		Retangulo ret4 = new Retangulo(4, 5, 6, 7);
		ret4.print();	
		
		Retangulo ret5 = new Retangulo();
		ret5.print();
		ret5.getA().setX(5);
		ret5.print();
		
		Retangulo ret6 = new Retangulo();
		ret6.print();
		ret6.getA().setY(5);
		ret6.print();
			
			
		}
	
}
