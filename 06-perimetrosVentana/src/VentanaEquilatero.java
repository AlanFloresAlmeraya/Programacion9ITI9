import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author Flores Almeraya Osvaldo Alan
 *
 */
public class VentanaEquilatero extends JFrame implements ActionListener {

	/**
	 * Se declaran los componentes para la creacion de la ventana
	 */
	private JLabel lbLado = new JLabel("Lado");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtLado = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnMenu = new JButton("Menu");
	
	private Container c = getContentPane();
	private PerimetrosVentana p = new PerimetrosVentana();
	
	/**
	 * Se crea el metodo constructor para la ventana de circulo
	 */
	public VentanaEquilatero() {
		super.setTitle("Ventana Equilatero");
		super.setSize(320, 300);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		CargarControladores ();
	}
	
	/**
	 * Se crea un metodo para cargar los controladores y adredarlos al contenedor de la ventana
	 */
	private void CargarControladores() {
		c.setLayout(null);
		
		lbLado.setBounds(10, 10, 270, 30);
		txtLado.setBounds(10, 40, 270, 30);
		lbResultado.setBounds(10, 80, 270, 30);
		btnCalcular.setBounds(10, 120, 100, 30);
		btnMenu.setBounds(120, 120, 100, 30);
		
		c.add(lbLado);
		c.add(txtLado);
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
	public void actionPerformed(ActionEvent arg0) {
		/**
		 * Se crea un if para comparar las acciones que se haran dependiendo el boton, en este caso el boton es el de calcular
		 * Se agregara el resultado al lbResultado de las operaciones
		 */
		if(arg0.getSource()==btnCalcular){
			int r = p.trianguloEquilatero(
					Integer.parseInt(txtLado.getText()));
			lbResultado.setText(String.format("%s * 3 = %d",
					txtLado.getText(), r));
		}
		/**
		 * se utiliza un else if para cuando se precione el boton btnMenu te regrese al menu de los triangulos 
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		else if(arg0.getSource()==btnMenu){
			VentanaTriangulos vtnTriangulos = new VentanaTriangulos();
			vtnTriangulos.setVisible(true);
		}
		
	}

}
