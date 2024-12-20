package ec.edu.puce.facturacion.forms;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmListaClientes extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable ttblClientes;
	

	public FrmListaClientes() {
		setIconifiable(true);
		setMaximizable(true);
		setTitle("Lista de Clientes");
		setClosable(true);
		setBounds(100, 100, 1009, 399);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 51, 550, 307);
		getContentPane().add(scrollPane);
		
		ttblClientes = new JTable();
		ttblClientes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cedula", "Nombres", "Accion", "Apellidos", "Email", "Telefono", "Direccion"
			}));
		scrollPane.setViewportView(ttblClientes);
		
		JButton btnNewButton = new JButton("Agregar Nuevo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmNuevoCliente frmNuevoCliente = new FrmNuevoCliente();
				frmNuevoCliente.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(10, 17, 134, 23);
		getContentPane().add(btnNewButton);

	}
}
