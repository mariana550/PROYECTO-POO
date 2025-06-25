
package gym;

import javax.swing.*;

public class VentanaRutina extends JFrame {
    public VentanaRutina(Rutina rutina) {
        setTitle("Tu rutina");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JTextArea areaRutina = new JTextArea(rutina.obtenerRutina());
        areaRutina.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaRutina);
        scroll.setBounds(20, 20, 350, 220);
        add(scroll);

        setVisible(true);
    }
}
