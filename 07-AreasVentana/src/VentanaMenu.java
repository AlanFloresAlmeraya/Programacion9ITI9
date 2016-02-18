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
public class VentanaMenu extends JFrame implements ActionListener{

	/**
	 * Se declaran los componentes para la creacion de la ventana
	 */
	private JButton btnCuadrado = new JButton("Cuadrado");
	private JButton btnRectangulo = new JButton("Rectangulo");
	private JButton btnTriangulo = new JButton("Triangulo");
	private JButton btnCirculo = new JButton("Circulo");
	
	private Container c = getContentPane();
	
	/**
	 * Se crea el metodo constructor para la ventana de menu
	 */
	public VentanaMenu (){
		super.setTitle("Menu Areas");
		super.setSize(320,250);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		CargarControladores();
		
	}
	
	/**
	 * Se crea un metodo para cargar los controladores y adredarlos al contenedor de la ventana
	 */
	private void CargarControladores() {
		
		c.setLayout(null);
		
		btnCuadrado.setBounds(10, 10, 270, 30);
		btnRectangulo.setBounds(10, 50, 270, 30);
		btnTriangulo.setBounds(10, 90, 270, 30);
		btnCirculo.setBounds(10, 130, 270, 30 );
		
		c.add(btnCuadrado);
		c.add(btnRectangulo);
		c.add(btnTriangulo);
		c.add(btnCirculo);
		
		btnCuadrado.addActionListener(this);
		btnRectangulo.addActionListener(this);
		btnTriangulo.addActionListener(this);
		btnCirculo.addActionListener(this);
	}

	/**
	 * Se crea metodo del actionListener para que valla a la ventana deseada dependiendo el boton precionado 
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		/**
		 * se utiliza un if para cuando se precione el boton btnCuadrado te mande al menu del cuadrado
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		if(arg0.getSource()== btnCuadrado){
			VentanaCuadrado vtnCuadrado = new VentanaCuadrado();
			vtnCuadrado.setVisible(true);
		}
		/**
		 * se utiliza un else if para cuando se precione el boton btnRectangulo te mande al menu del rectangulo
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		else if(arg0.getSource()==btnRectangulo){
			VentanaRectangulo vtnRectangulo = new VentanaRectangulo();
			vtnRectangulo.setVisible(true);
		}
		/**
		 * se utiliza un else if para cuando se precione el boton btnTriangulos te mande al menu del triangulo
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		else if(arg0.getSource()==btnTriangulo){
			VentanaTriangulos vtnTriangulos = new VentanaTriangulos();
			vtnTriangulos.setVisible(true);
		}
		/**
		 * se utiliza un else if para cuando se precione el boton btnCirculo te mande al menu del circulo
		 * se crea un objeta de la ventana principal para luego hacerla visible
		 */
		else if(arg0.getSource()==btnCirculo){
			VentanaCirculo vtnCirculo = new VentanaCirculo();
			vtnCirculo.setVisible(true);
		}
		
	}

}
