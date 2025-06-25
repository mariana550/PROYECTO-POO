
package gym;

import javax.swing.*;

public class MenuPrincipal extends JFrame {
    private Usuario usuario;
    private JTextField campoPeso;
    private JButton botonVerRutina;
    private JButton botonActualizarPeso;

    public MenuPrincipal(Usuario usuario) {
        this.usuario = usuario;
        setTitle("Bienvenido " + usuario.getNombre());
        setSize(400, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel labelPeso = new JLabel("Ingrese su peso (kg):");
        labelPeso.setBounds(20, 30, 150, 25);
        add(labelPeso);

        campoPeso = new JTextField();
        campoPeso.setBounds(170, 30, 100, 25);
        add(campoPeso);

        botonVerRutina = new JButton("Ver rutina");
        botonVerRutina.setBounds(50, 80, 120, 30);
        add(botonVerRutina);

        botonActualizarPeso = new JButton("Actualizar peso");
        botonActualizarPeso.setBounds(200, 80, 150, 30);
        add(botonActualizarPeso);

        botonVerRutina.addActionListener(e -> {
            try {
                double peso = Double.parseDouble(campoPeso.getText());
                usuario.setPeso(peso);
                Rutina rutina = Rutina.generarRutina(peso);
                new VentanaRutina(rutina);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido.");
            }
        });

        botonActualizarPeso.addActionListener(e -> new VentanaActualizarPeso(usuario));
    }
}
