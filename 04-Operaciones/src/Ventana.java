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
public class Ventana extends JFrame implements ActionListener {
	/**
	 * Se declaran los componentes de la ventana en privado
	 */
	private JTextField txtN1=new JTextField();
	private JTextField txtN2=new JTextField();
	
	private JLabel lbN1= new JLabel("Numero 1");
	private JLabel lbN2= new JLabel("Numero 2");
	private JLabel lbN3= new JLabel("");
	
	private JButton btnSuma=new JButton("Suma");
	private JButton btnResta=new JButton("Resta");
	private JButton btnMulti=new JButton("Multiplicación");
	private JButton btnDivi=new JButton("Divición");
	
    private Container c = getContentPane();
	
	private Operaciones op = new Operaciones();
	/**
	 * Se crea el metodo de la ventana 
	 */
	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles() ;
	}
	/**
	 * se crea el metodo donde se cargan los controles 
	 */
private void cargarControles() {
		/**
		 * Se declara el tipo de Layout y la posicion de los Componentes de la Ventana 
		 */
		c.setLayout(null);
		
		
		lbN1.setBounds(10, 10, 270, 30);
		txtN1.setBounds(10, 40, 270, 30);
		
		lbN2.setBounds(10, 80, 270, 30);
		txtN2.setBounds(10, 110, 270, 30);
		
		btnSuma.setBounds(10, 150, 120,35);
		btnResta.setBounds(120, 150, 120,35);
		btnMulti.setBounds(10, 200, 120,35);
		btnDivi.setBounds(120, 200, 120,35);
		
		lbN3.setBounds(10, 240, 270, 30);
		
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnSuma);
		c.add(btnResta);
		c.add(btnMulti);
		c.add(btnDivi);
		c.add(lbN3);
		
		/**
		 * se asigna la accion a los botones
		 */
		btnSuma.addActionListener(this);
		btnResta.addActionListener(this);
		btnMulti.addActionListener(this);
		btnDivi.addActionListener(this);
		
	}
@Override
/**
 * se crea el metodo para escuchar a los botones 
 */
public void actionPerformed(ActionEvent arg0) {
	/**
	 * Se utiliza un if para hacer la distincion de acciones para cada Boton
	 */
	if(arg0.getSource()== btnSuma){
		int r = op.sumar(
				Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN2.getText())
				);
		lbN3.setText(String.format("%s + %s = %d", 
				txtN1.getText(), 
				txtN2.getText(), 
				r)
				);
	}
	
	else if (arg0.getSource()== btnResta) {
		int r = op.restar(
				Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN2.getText())
				);
		lbN3.setText(String.format("%s - %s = %d", 
				txtN1.getText(), 
				txtN2.getText(), 
				r)
				);
	}
	
	else if (arg0.getSource()== btnMulti) {
		int r = op.multiplicar(
				Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN2.getText())
				);
		lbN3.setText(String.format("%s * %s = %d", 
				txtN1.getText(), 
				txtN2.getText(), 
				r)
				);
	}
	
	else if (arg0.getSource()== btnDivi) {
		int r = op.dividir(
				Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN2.getText())
				);
		lbN3.setText(String.format("%s / %s = %d", 
				txtN1.getText(), 
				txtN2.getText(), 
				r)
				);
	}
	
}

}
