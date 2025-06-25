package gym;

import javax.swing.*;


public class RegistroUsuario extends JFrame {
    public RegistroUsuario() {
        ConexionUsuario.crearTablaSiNoExiste();
        setTitle("Registrar Usuario");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 80, 25);
        panel.add(lblNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(120, 30, 160, 25);
        panel.add(txtNombre);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(30, 70, 80, 25);
        panel.add(lblPass);

        JPasswordField txtPass = new JPasswordField();
        txtPass.setBounds(120, 70, 160, 25);
        panel.add(txtPass);

        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(120, 120, 100, 30);
        panel.add(btnRegistrar);

        btnRegistrar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            String pass = new String(txtPass.getPassword());
            if (!nombre.isEmpty() && !pass.isEmpty()) {
                Usuario nuevo = new Usuario(nombre, pass);
            UsuarioService.registrar(nuevo);
            JOptionPane.showMessageDialog(this, "Usuario '" + nombre + "' registrado correctamente");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Completa todos los campos");
            }
        });

        add(panel);
    }
}