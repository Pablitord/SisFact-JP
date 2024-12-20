package ec.edu.puce.facturacion.forms;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmNuevoCliente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCedula;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private FrmListaClientes frmListaClientes;

	
	public FrmNuevoCliente(FrmListaClientes frmListaClientes) {
		
		this.frmListaClientes = frmListaClientes;
		
		setTitle("Nuevo Cliente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblCdula = new JLabel("Cédula");
		lblCdula.setBounds(27, 48, 81, 14);
		contentPanel.add(lblCdula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(133, 42, 174, 20);
		contentPanel.add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(27, 73, 81, 14);
		contentPanel.add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(133, 67, 174, 20);
		contentPanel.add(txtNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(27, 98, 81, 14);
		contentPanel.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(133, 92, 174, 20);
		contentPanel.add(txtApellidos);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(27, 123, 81, 14);
		contentPanel.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(133, 117, 174, 20);
		contentPanel.add(txtDireccion);
		
		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(27, 148, 81, 14);
		contentPanel.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(133, 145, 174, 20);
		contentPanel.add(txtTelefono);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(27, 173, 81, 14);
		contentPanel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(133, 170, 174, 20);
		contentPanel.add(txtEmail);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String cedula = txtCedula.getText();
						String nombres = txtNombres.getText();
						String apellidos = txtApellidos.getText();
						String direccion = txtDireccion.getText();
						String telefono = txtTelefono.getText();
						String email = txtEmail.getText();
						
						frmListaClientes.agregarCliente(cedula, nombres, apellidos, direccion, telefono, email);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
