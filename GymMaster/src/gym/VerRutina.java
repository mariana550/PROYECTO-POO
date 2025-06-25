package gym;

import javax.swing.*;
import java.awt.*;

public class VerRutina extends JFrame {
    public VerRutina(Usuario usuario) {
        setTitle("Rutina Actual");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Rutina rutina = Rutina.generarRutina(usuario.getPeso());
        JTextArea area = new JTextArea(rutina.obtenerRutina());
        area.setEditable(false);
        area.setFont(new Font("Monospaced", Font.PLAIN, 14));

        panel.add(new JScrollPane(area), BorderLayout.CENTER);
        add(panel);
    }
}