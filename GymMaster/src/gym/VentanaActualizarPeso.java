
package gym;

import javax.swing.*;

public class VentanaActualizarPeso extends JFrame {
    public VentanaActualizarPeso(Usuario usuario) {
        setTitle("Actualizar peso");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel labelPeso = new JLabel("Nuevo peso (kg):");
        labelPeso.setBounds(30, 30, 120, 25);
        add(labelPeso);

        JTextField campoPeso = new JTextField();
        campoPeso.setBounds(150, 30, 120, 25);
        add(campoPeso);

        JButton botonActualizar = new JButton("Actualizar");
        botonActualizar.setBounds(100, 80, 120, 30);
        add(botonActualizar);

        botonActualizar.addActionListener(e -> {
            try {
                double nuevoPeso = Double.parseDouble(campoPeso.getText());
                usuario.setPeso(nuevoPeso);
                ConexionUsuario.actualizarPeso(usuario.getNombre(), nuevoPeso);
                Rutina rutina = Rutina.generarRutina(nuevoPeso);
                new VentanaRutina(rutina);
                dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido.");
            }
        });

        setVisible(true);
    }
}
