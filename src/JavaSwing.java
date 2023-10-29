import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Color;

public class JavaSwing implements ActionListener {

    public static void main(String[] args) {
        JPanel panel = new JPanel(new FlowLayout());
        JFrame frame = new JFrame();


        ImageIcon icon = new ImageIcon("C:\\Users\\fojtik.AC\\Downloads\\1147.jpg");
        Image image = icon.getImage();



        //JPanel panel = new JPanel(); //to je layout.. musime jako prvni vlozit okno na layout
        panel.setLayout(null);
        frame.setSize(350, 350); //frame je okno
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setIconImage(image);
        frame.getContentPane().setBackground(new Color(192, 192, 192)); // Light gray


        //user text
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 40, 80, 25);
        panel.add(userLabel);

        //user kolonka
        JTextField userText = new JTextField();
        userText.setBounds(100, 40, 165, 25);
        panel.add(userText);


        // Password text

        JLabel password = new JLabel("Password");
        password.setBounds(10, 80, 80, 25);
        panel.add(password);

        // Password kolonka
        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 80, 165, 25);
        panel.add(pass);

        JButton button = new JButton("Login");
        button.setBounds(10, 120, 80, 25);
        button.addActionListener(new JavaSwing());
        panel.add(button);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Clicked homie!");

    }
}

