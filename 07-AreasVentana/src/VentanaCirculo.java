import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author Flores Almeraya Osvaldo Alan
 *
 */
public class VentanaCirculo extends JFrame implements ActionListener {

	/**
	 * Se declaran los componentes para la creacion de la ventana
	 */
	private JTextField txtN1 = new JTextField();
	private JLabel lbN1 = new JLabel("Radio");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnMenu = new JButton("Menu");
	
	private Container c = getContentPane();
	private AreasVentana op = new AreasVentana();
	
	/**
	 * Se crea el metodo constructor para la ventana de circulo
	 */
	public VentanaCirculo() {
		super.setTitle("Circulo");
		super.setSize(320, 300);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles() ;
	}
	/**
	 * Se crea un metodo para cargar los controladores y adredarlos al contenedor de la ventana
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbN1.setBounds(10, 10, 270, 30);
		txtN1.setBounds(10, 40, 270, 30);
		lbResultado.setBounds(10, 80, 270, 30);
		btnCalcular.setBounds(10, 120, 100, 30);
		btnMenu.setBounds(120, 120, 100, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbResultado);
		c.add(btnCalcular);
		c.add(btnMenu);
		
		btnCalcular.addActionListener(this);
		btnMenu.addActionListener(this);
	}
	
	/**
	 * Se crea metodo del actionListener para que calcule o regrese al menu dependiendo el boton precionado 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * Se crea un if para comparar las acciones que se haran dependiendo el boton, en este caso el boton es el de calcular
		 * Se agregara el resultado al lbResultado de las operaciones
		 */
		if(e.getSource()==btnCalcular){
			double r = op.circulo(
					Double.parseDouble(txtN1.getText())
					//Integer.parseInt(txtN1.getText())
					);
			lbResultado.setText(String.format("pi * (%s * %s) = %s", 
					txtN1.getText(),
					txtN1.getText(),r));
			}
		/**
		 * se utiliza un else if para cuando se precione el boton btnMenu te regrese al menu principal 
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
			else if(e.getSource()==btnMenu){
				VentanaMenu vtnMenu = new VentanaMenu();
				vtnMenu.setVisible(true);
			}
	}

}
