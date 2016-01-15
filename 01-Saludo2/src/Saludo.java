import javax.swing.JOptionPane;
/**
 * 
 * @author OsvaldoAlanFloresAlmeraya
 */
public class Saludo {
	/**
	 * 
	 * @param args diferentes maneras de mostrar
	 */
	public static void main(String[] args) {
		String nombre="Alan";
		String edad="23";
		//System.out.println("hola " + nombre);
		//System.out.printf("hola: %s", nombre);
		JOptionPane.showMessageDialog(null,  String.format("hola: %s tu edad es %s años de edad", nombre,edad));
		
	}

}
