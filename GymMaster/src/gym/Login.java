package gym;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoContraseña;
    private JButton botonLogin;

    public Login() {
        setTitle("GYM Login");
        setSize(400, 250);
        setLocationRelativeTo(null); // Centra la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(40, 40, 40));
        panel.setLayout(null);

        // Cargar imagen/logo
        ImageIcon icono = new ImageIcon("gym_logo.png");
        JLabel imagen = new JLabel(icono);
        imagen.setBounds(20, 10, 64, 64);
        panel.add(imagen);

        JLabel titulo = new JLabel("Inicio de Sesión");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(110, 10, 200, 30);
        panel.add(titulo);

        JLabel labelUsuario = new JLabel("Usuario:");
        labelUsuario.setForeground(Color.WHITE);
        labelUsuario.setBounds(50, 80, 80, 25);
        panel.add(labelUsuario);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(140, 80, 180, 25);
        panel.add(campoUsuario);

        JLabel labelContraseña = new JLabel("Contraseña:");
        labelContraseña.setForeground(Color.WHITE);
        labelContraseña.setBounds(50, 120, 80, 25);
        panel.add(labelContraseña);

        campoContraseña = new JPasswordField();
        campoContraseña.setBounds(140, 120, 180, 25);
        panel.add(campoContraseña);

        botonLogin = new JButton("Ingresar");
        botonLogin.setBounds(90, 150, 100, 30);
        botonLogin.setBackground(new Color(70, 130, 180));
        botonLogin.setForeground(Color.WHITE);
        botonLogin.setFocusPainted(false);
        panel.add(botonLogin);

        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(200, 150, 100, 30);
        btnRegistrar.setBackground(new Color(100, 149, 237));
        btnRegistrar.setForeground(Color.WHITE);
        btnRegistrar.setFocusPainted(false);
        panel.add(btnRegistrar);

        btnRegistrar.addActionListener(e -> {
            new RegistroUsuario().setVisible(true);
        });


        botonLogin.addActionListener(e -> {
            String user = campoUsuario.getText();
            String pass = new String(campoContraseña.getPassword());

            Usuario usuario = UsuarioService.autenticar(user, pass);
            if (usuario != null) {
                new MenuPrincipal(usuario).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        });

        add(panel);
    }
}