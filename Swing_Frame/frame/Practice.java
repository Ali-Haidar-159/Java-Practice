package frame;

import javax.swing.*;
import java.awt.*;

class FrameDemo extends JFrame {

    Container c;
    ImageIcon logo , logo2;
    JLabel labl , labl2 ;

    FrameDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(600, 120, 600, 500);
        logo = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(logo.getImage());

        this.setVisible(true);

        this.contentPane();
    }

    void contentPane() {
    c = this.getContentPane();
    c.setBackground(Color.lightGray);
    c.setLayout(null);

    // Load the ImageIcon
    ImageIcon logo2 = new ImageIcon(getClass().getResource("logo.png"));
    
    // Check if the ImageIcon loaded successfully
    if (logo2 != null) {
        // Create and position the JLabel with the loaded ImageIcon
        JLabel labl2 = new JLabel(logo2);
        labl2.setBounds(50, 25, logo2.getIconWidth(), logo2.getIconHeight());
        
        // Add the JLabel to the content pane
        c.add(labl2);
    } else {
        System.err.println("Error loading logo.png");
    }
}


}
