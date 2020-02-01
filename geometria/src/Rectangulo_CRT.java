/**
 * 
 * @author Celia Ruiz Tomas
 * @version 1.2
 *
 */
public class Rectangulo_CRT extends FiguraGeometrica_CRT {
	private double l1;
	private double l2;
	/**
	 * Constructor
	 * @param tipoFigura forma
	 * @param lG lado G
	 * @param lP lado P
	 */
	
	public Rectangulo_CRT(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Mide el área
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Mide el perímetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
