package bomberossystem;

import javax.swing.UIManager;
import view.VoluntarioFormView;

public class BomberosSystem {

    public static void main(String[] args) {
        setNimbusLookAndFeel();

        java.awt.EventQueue.invokeLater(() -> {
            new VoluntarioFormView().setVisible(true);
        });
    }
    
    //Este codigo hace que el form use el LookAndFeel "Nimbus", ya que el LAF "windows" (el default) no muestra bien los colores que puse
    private static void setNimbusLookAndFeel() {
        UIManager.installLookAndFeel("Nimbus", "javax.swing.plaf.nimbus.NimbusLookAndFeel");
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ignored) {}
    }
}
