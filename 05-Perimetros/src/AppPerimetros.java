/**
 * 
 * @author Flores Almeraya Osvaldo Alan
 *
 */
public class AppPerimetros {
	/**
	 * 
	 * @param args es el parametro que tienes para tu metodo main (principal)
	 * En este se crea un objeto de la clase perimetros y lo muestra el consola
	 */
	public static void main(String[] args) {
		Perimetros p = new Perimetros();
		System.out.printf("El perimetro del cuadrado es: %d",
				p.cuadrado(10));
	}
}
