package gym;

import javax.swing.*;
import java.awt.*;

public class ActualizarPeso extends JFrame {
    public ActualizarPeso(Usuario usuario) {
        setTitle("Actualizar Peso");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblNuevoPeso = new JLabel("Nuevo peso (kg):");
        lblNuevoPeso.setBounds(30, 30, 120, 25);
        panel.add(lblNuevoPeso);

        JTextField txtNuevoPeso = new JTextField();
        txtNuevoPeso.setBounds(160, 30, 100, 25);
        panel.add(txtNuevoPeso);

        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(110, 80, 100, 30);
        panel.add(btnActualizar);

        btnActualizar.addActionListener(e -> {
            try {
                double nuevoPeso = Double.parseDouble(txtNuevoPeso.getText());
                usuario.setPeso(nuevoPeso);
                JOptionPane.showMessageDialog(this, "Peso actualizado correctamente");
                dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Peso inválido");
            }
        });

        add(panel);
    }
}