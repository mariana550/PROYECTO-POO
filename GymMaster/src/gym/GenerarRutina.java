package gym;

import javax.swing.*;
import java.awt.*;

public class GenerarRutina extends JFrame {
    public GenerarRutina(Usuario usuario) {
        setTitle("Generar Rutina");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblPeso = new JLabel("Peso actual: " + usuario.getPeso() + " kg");
        lblPeso.setBounds(30, 30, 250, 25);
        panel.add(lblPeso);

        JButton btnGenerar = new JButton("Generar Rutina");
        btnGenerar.setBounds(90, 80, 160, 30);
        panel.add(btnGenerar);

        btnGenerar.addActionListener(e -> {
            Rutina rutina = Rutina.generarRutina(usuario.getPeso());
            JOptionPane.showMessageDialog(this, rutina.obtenerRutina(), "Rutina Personalizada", JOptionPane.INFORMATION_MESSAGE);
        });

        add(panel);
    }
}