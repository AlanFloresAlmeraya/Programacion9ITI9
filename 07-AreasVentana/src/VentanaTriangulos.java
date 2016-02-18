import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 
 * @author Flores Almeraya Osvaldo Alan
 *
 */
public class VentanaTriangulos extends JFrame implements ActionListener {
	/**
	 * Se declaran los componentes para la creacion de la ventana
	 */
	private JButton btnEquilatero = new JButton("Equilatero");
	private JButton btnIsosceles = new JButton("Isosceles");
	private JButton btnEscaleno = new JButton("Escaleno");
	private JButton btnMenu = new JButton("Menu");
	
	private Container c = getContentPane();
	/**
	 * Se crea el metodo constructor para la ventana de los triangulos
	 */
	public VentanaTriangulos() {
		super.setTitle("Menu Triangulos");
		super.setSize(320, 200);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControladores();	
	}
	/**
	 * Se crea un metodo para cargar los controladores y adredarlos al contenedor de la ventana
	 */
	private void cargarControladores() {
		c.setLayout(null);
		
		btnEquilatero.setBounds(10, 10, 270, 30);
		btnEscaleno.setBounds(10, 50, 270, 30);
		btnIsosceles.setBounds(10, 90, 270, 30);
		btnMenu.setBounds(70, 130, 150, 30);
		
		c.add(btnEquilatero);
		c.add(btnEscaleno);
		c.add(btnIsosceles);
		c.add(btnMenu);
		
		btnEquilatero.addActionListener(this);
		btnEscaleno.addActionListener(this);
		btnIsosceles.addActionListener(this);
		btnMenu.addActionListener(this);
	
	}
	/**
	 * Se crea metodo del actionListener para que valla a la ventana deseada dependiendo el boton precionado 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * se utiliza un if para cuando se precione el boton btnEquilater te mande al menu del triangulo Equilatero
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		if(e.getSource()==btnEquilatero){
			VentanaEquilatero vtnEquilaro = new VentanaEquilatero();
			vtnEquilaro.setVisible(true);
		}
		/**
		 * se utiliza un else if para cuando se precione el boton btnEscaleno te mande al menu del triangulo Escaleno
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		else if(e.getSource()==btnEscaleno){
			VentanaEscaleno vtnEscaleno = new VentanaEscaleno();
			vtnEscaleno.setVisible(true);
		}
		/**
		 * se utiliza un else if para cuando se precione el boton btnIsosceles te mande al menu del triangulo Isosceles
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		else if(e.getSource()==btnIsosceles){
			VentanaIsosceles vtnIsosceles = new VentanaIsosceles();
			vtnIsosceles.setVisible(true);
		}
		/**
		 * se utiliza un else if para cuando se precione el boton btnMenu te mande al menu principal
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		else if(e.getSource()==btnMenu){
			VentanaMenu ventanaMenu = new VentanaMenu();
			ventanaMenu.setVisible(true);
		}
	}

}
