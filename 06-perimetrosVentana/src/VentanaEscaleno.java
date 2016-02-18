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
public class VentanaEscaleno extends JFrame implements ActionListener{

	/**
	 * Se declaran los componentes para la creacion de la ventana
	 */
	private JLabel lbLado1 = new JLabel("Lado");
	private JLabel lbLado2 = new JLabel("Lado 2");
	private JLabel lbLado3 = new JLabel("Lado 3");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtLado1 = new JTextField();
	private JTextField txtLado2 = new JTextField();
	private JTextField txtLado3 = new JTextField();
	
	private JButton btnCalcular =new JButton("Calcular");
	private JButton btnMenu = new JButton("Menu");
	
	private Container c = getContentPane();
	private PerimetrosVentana op = new PerimetrosVentana();
	
	/**
	 * Se crea el metodo constructor para la ventana de circulo
	 */
    public VentanaEscaleno() {
		super.setTitle("Escaleno");
		super.setSize(320, 380);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControladores ();
		
	}
	
    /**
	 * Se crea un metodo para cargar los controladores y adredarlos al contenedor de la ventana
	 */
	private void cargarControladores() {
		c.setLayout(null);
		
		lbLado1.setBounds(10, 10, 270, 30);
		txtLado1.setBounds(10, 40, 270, 30);
		lbLado2.setBounds(10, 80, 270, 30);
		txtLado2.setBounds(10, 120, 270, 30);
		lbLado3.setBounds(10, 160, 270, 30);
		txtLado3.setBounds(10, 200, 270, 30);
		lbResultado.setBounds(10, 240, 270, 30);
		btnCalcular.setBounds(10, 280, 100, 30);
		btnMenu.setBounds(120, 280, 100, 30);
		
		c.add(lbLado1);
		c.add(txtLado1);
		c.add(lbLado2);
		c.add(txtLado2);
		c.add(lbLado3);
		c.add(txtLado3);
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
		int r = op.trianguloEscaleno(
				Integer.parseInt(txtLado1.getText()),
				Integer.parseInt(txtLado2.getText()),
				Integer.parseInt(txtLado3.getText()));
		lbResultado.setText(String.format(" %s + %s +%s = %d",
				txtLado1.getText(),
				txtLado2.getText(),
				txtLado3.getText(),
				r));
		}
		/**
		 * se utiliza un else if para cuando se precione el boton btnMenu te regrese al menu de los triangulos
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		else if(e.getSource()==btnMenu){
			VentanaTriangulos vtnTriangulos = new VentanaTriangulos();
			vtnTriangulos.setVisible(true);
		}
		}


}
