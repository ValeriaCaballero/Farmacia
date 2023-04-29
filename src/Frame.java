import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_nombre;
	private JTextField textField_correo;
	private JTextField textField_pedido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_nombre = new JTextField();
		textField_nombre.setBounds(175, 68, 206, 20);
		contentPane.add(textField_nombre);
		textField_nombre.setColumns(10);
		
		textField_correo = new JTextField();
		textField_correo.setText("");
		textField_correo.setBounds(175, 107, 206, 20);
		contentPane.add(textField_correo);
		textField_correo.setColumns(10);
		
		textField_pedido = new JTextField();
		textField_pedido.setBounds(175, 143, 206, 20);
		contentPane.add(textField_pedido);
		textField_pedido.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(54, 71, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCorreo.setBounds(54, 110, 93, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblPedido = new JLabel("Pedido");
		lblPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPedido.setBounds(54, 146, 93, 14);
		contentPane.add(lblPedido);
		
		JLabel lblNewLabel_1 = new JLabel("Farmacia CONKAL");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(40, 11, 341, 46);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Escribir ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedWriter out = new BufferedWriter(new FileWriter("Pedidos.txt"));
					String textnom = textField_nombre.getText();
					String textcor = textField_correo.getText();
					String textped = textField_pedido.getText();
					
					String cadena = ("Cliente:" + textnom + "Correo electrónico: " + textcor + "Pedido: " + textped); 
					
					out.newLine();//cambio de línea en el archivo
					out.write(cadena); // escribimos toda la línea
					out.close();
					} catch (IOException o) {
					// TODO Auto-generated catch block
					System.out.println(o.getMessage());
					o.printStackTrace();	
			}
		}
	});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(40, 197, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Leer");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(179, 197, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Objeto");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(308, 197, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
