package frame_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame1 extends JFrame {

    private Dimension size;
    private ImageIcon icon;
    private Container c;
    private Font fnt;
    private JLabel user, pass;
    private JTextField user1;
    private JPasswordField pass1;
    private JButton login, clear;

    class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == login) {
                if (user1.getText().equals("ali") && pass1.getText().equals("123")) {
                    JOptionPane.showMessageDialog(null, "You successfully login");
                    dispose();
                    Frame12 f = new Frame12();
                }  
                else 
                  JOptionPane.showMessageDialog(null, "Invalid user name or password");
                

            } else if (e.getSource() == clear) {
                user1.setText("");
                pass1.setText("");
            }
        }
    }
    Action act = new Action();

    Frame1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Login Frame");

        size = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(size.width, size.height);

        this.setLocation(0, 0);

        icon = new ImageIcon(getClass().getResource("icon.jpg"));
        this.setIconImage(icon.getImage());

        this.separateContentPane();
        this.addComponant();

        this.setVisible(true);
    }

    void separateContentPane() {
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
    }

    void addComponant() {
        fnt = new Font("Times New Roman", Font.BOLD, 18);

        user = new JLabel("Enter your name : ");
        user.setBounds(100, 50, 300, 60);
        user.setFont(fnt);
        c.add(user);

        user1 = new JTextField();
        user1.setBounds(400, 50, 300, 60);
        user1.setFont(fnt);
        user1.setHorizontalAlignment(JTextField.CENTER);
        c.add(user1);

        pass = new JLabel("Enter your password : ");
        pass.setBounds(100, 135, 300, 60);
        pass.setFont(fnt);
        c.add(pass);

        pass1 = new JPasswordField();
        pass1.setBounds(400, 135, 300, 60);
        pass1.setHorizontalAlignment(JPasswordField.CENTER);
        pass1.setEchoChar('*');
        pass1.setFont(fnt);
        c.add(pass1);

        login = new JButton("Login");
        login.setBounds(400, 210, 140, 60);
        login.setFont(fnt);
        c.add(login);
        login.addActionListener(act);

        clear = new JButton("Clear");
        clear.setBounds(550, 210, 140, 60);
        clear.setFont(fnt);
        c.add(clear);
        clear.addActionListener(act);
    }
}
