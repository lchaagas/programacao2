package prog2;

import org.junit.Test;

public class Linha2DTest {

	@Test
	public void LinhaTest() {
		Linha2D linha = new Linha2D();
		linha.print();
		
		Linha2D linha2 = new Linha2D(new Ponto2D(3,5));
		linha2.print();
		
		Linha2D linha3= new Linha2D(new Ponto2D(3,5), new Ponto2D(6,7));
		linha3.print();
		
		Linha2D linha4 = new Linha2D(1.0, 2.0, 3.0, 4.0);
		linha4.print();
		
		Linha2D linha5 = new Linha2D();
		linha5.print();
		linha5.getA().setX(5);
		linha5.print();
		
		Linha2D linha6 = new Linha2D();
		linha6.print();
		linha6.getA().setY(5);
		linha6.print();
	}
	
	

}
