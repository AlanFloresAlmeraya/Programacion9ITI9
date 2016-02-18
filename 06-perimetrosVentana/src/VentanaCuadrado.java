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
public class VentanaCuadrado extends JFrame implements ActionListener{

	/**
	 * Se declaran los componentes para la creacion de la ventana
	 */
	private JTextField txtN1 = new JTextField();
	private JLabel lbN1 = new JLabel("Lado");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnMenu = new JButton("Menu");
	
	private Container c = getContentPane();
	private PerimetrosVentana op = new PerimetrosVentana();
	
	/**
	 * Se crea el metodo constructor para la ventana de circulo
	 */
	public VentanaCuadrado(){
		super.setTitle("Cuadrado");
		super.setSize(320, 250);
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
	public void actionPerformed(ActionEvent arg0) {
		/**
		 * Se crea un if para comparar las acciones que se haran dependiendo el boton, en este caso el boton es el de calcular
		 * Se agregara el resultado al lbResultado de las operaciones
		 */
		if(arg0.getSource()==btnCalcular){
		int r = op.cuadrado(
				Integer.parseInt(txtN1.getText())
				);
		lbResultado.setText(String.format("%s + %s + %s +%s = %d", 
				txtN1.getText(), txtN1.getText(), txtN1.getText(), txtN1.getText(), r));
		}
		/**
		 * se utiliza un else if para cuando se precione el boton btnMenu te regrese al menu principal 
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		else if(arg0.getSource()==btnMenu){
			VentanaMenu vtnMenu = new VentanaMenu();
			vtnMenu.setVisible(true);
		}
		}

}
