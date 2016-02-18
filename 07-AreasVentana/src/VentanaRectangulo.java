import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author Flores Almeraya Osvaldo Alan
 *
 */
public class VentanaRectangulo extends JFrame implements ActionListener {
	/**
	 * Se declaran los componentes para la creacion de la ventana
	 */
	private JLabel lbBase = new JLabel("Base");
	private JLabel lbAltura = new JLabel("Altura");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtBase = new JTextField();
	private JTextField txtAltura = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnMenu = new JButton("Menu");
	
	private Container c = getContentPane();
	private AreasVentana op = new AreasVentana();
	/**
	 * Se crea el metodo constructor para la ventana del rectangulo
	 */
	public VentanaRectangulo(){
		super.setTitle("Rectangulo");
		super.setSize(320, 300);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		CargarControladores();
		
	}
	/**
	 * Se crea un metodo para cargar los controladores y adredarlos al contenedor de la ventana
	 */
	private void CargarControladores() {
		
		c.setLayout(null);
		lbBase.setBounds(10, 10, 270, 30);
		txtBase.setBounds(10, 40, 270, 30);
		lbAltura.setBounds(10, 80, 270, 30);
		txtAltura.setBounds(10, 120, 270, 30);
		lbResultado.setBounds(10, 160, 270, 30);
		btnCalcular.setBounds(10, 200, 100, 30);
		btnMenu.setBounds(120, 200, 100, 30);
		
		c.add(lbBase);
		c.add(txtBase);
		c.add(lbAltura);
		c.add(txtAltura);
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
		if (arg0.getSource()==btnCalcular){
			int r = op.rectangulo(
					Integer.parseInt(txtBase.getText()),
					Integer.parseInt(txtAltura.getText()));
			
			lbResultado.setText(String.format("%s * %s = %d",
					txtBase.getText(),
					txtAltura.getText(),
					r));
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
