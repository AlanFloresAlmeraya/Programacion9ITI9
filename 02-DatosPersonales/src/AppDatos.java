import javax.swing.JOptionPane;

/**
 * 
 * @author OsvaldoAlanFloresAlmeraya
 *
 */
public class AppDatos {

	public static void main(String[] args) {
		
Alumno al = new Alumno("Alan","23","54545454545","Texcoco","TI","1.68","70","alan@gmail.com","56070","hombre");

JOptionPane.showMessageDialog(null,
		String.format ("Hola %s \n tu edad es %s \n tu telefono %s \n tu domicilio es %s \n tu carrera es %s \n tu estatura es %s \ntu peso es %s \n tu correo es %s \n tu Codigo postal es %s \n tu sexo es %s",al.getNombre(),al.getEdad(),al.getTelefono(),al.getDomicilio(),al.getCarrera(),al.getEstatura(),al.getPeso(),al.getEmail(),al.getCp(),al.getSexo()));
	}

}
