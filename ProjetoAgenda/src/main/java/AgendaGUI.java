import javax.swing.*;
import java.awt.event.ActionListener;

public class AgendaGUI {
    
    JFrame frame;
    Agenda agenda;
    public AgendaGUI() {
      frame = new JFrame("Agenda");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setResizable(false);

      JLabel label = new JLabel("Agenda");
      frame.add(label);
      JButton button = new JButton("Buscar");
      frame.add(button);


    }
    
    
}
