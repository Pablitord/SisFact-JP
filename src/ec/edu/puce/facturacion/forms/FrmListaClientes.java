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
    private DefaultTableModel modelo;

    public FrmListaClientes() {
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de Clientes");
        setClosable(true);
        setBounds(100, 100, 751, 399);
        getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 51, 673, 307);
        getContentPane().add(scrollPane);

        ttblClientes = new JTable();
        modelo = new DefaultTableModel(
            new Object[][] {},
            new String[] {"Cédula", "Nombres", "Apellidos", "Dirección", "Teléfono", "Email"}
        );
        ttblClientes.setModel(modelo);
        scrollPane.setViewportView(ttblClientes);

        JButton btnNewButton = new JButton("Agregar Nuevo");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FrmNuevoCliente frmNuevoCliente = new FrmNuevoCliente(FrmListaClientes.this);
                frmNuevoCliente.setVisible(true);
            }
        });
        btnNewButton.setBounds(10, 17, 134, 23);
        getContentPane().add(btnNewButton);
    }

    public void agregarCliente(String cedula, String nombres, String apellidos, String direccion, String telefono, String email) {

    	Object[] nuevoCliente = {cedula, nombres, apellidos, direccion, telefono, email};
        modelo.addRow(nuevoCliente);
    }
}

