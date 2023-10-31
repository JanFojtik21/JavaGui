import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class JavaSwing implements ActionListener {



    private JFrame frame;
    private JTextField userFrame;
    private JPasswordField password;

    private JButton nextButton;
    private JLabel germanWordLabel;
    private JTextField czechTranslationField;
    private int currentWordIndex;



    public static void main(String[] args) {
        new JavaSwing(); // Vytvoření instance třídy JavaSwing
        new LanguageLearningApp();
    }

    public JavaSwing() {
        frame = new JFrame();
        JPanel panel = new JPanel(new FlowLayout());
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("C:\\Users\\fojtik.AC\\Downloads\\1147.jpg");
        frame.setIconImage(icon.getImage());
        panel.setLayout(null);
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(192, 192, 192));

        JLabel user = new JLabel("User");
        user.setBounds(10, 40, 80, 25);
        panel.add(user);

        userFrame = new JTextField();
        userFrame.setBounds(100, 40, 165, 25);
        panel.add(userFrame);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 80, 80, 25);
        panel.add(passwordLabel);

        password = new JPasswordField();
        password.setBounds(100, 80, 165, 25);
        panel.add(password);

        JButton button = new JButton("Login");
        button.setBounds(10, 120, 80, 25);
        button.addActionListener(this);
        panel.add(button);

        frame.setVisible(true);


    }


    private void openNewWindow() {
        JFrame newFrame = new JFrame("Nové Okno");
        newFrame.setSize(400, 300);
        newFrame.setVisible(true);
        frame.dispose(); // Skryje přihlašovací okno

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String expectedUsername = "Fojtas";
        String expectedPassword = "maxik";
        String username = userFrame.getText();
        String passwordText = new String(password.getPassword());

        if (username.equals(expectedUsername) && passwordText.equals(expectedPassword)) {
            openNewWindow();
        } else {
            JOptionPane.showMessageDialog(null, "Neplatné uživatelské jméno nebo heslo", "Chyba", JOptionPane.ERROR_MESSAGE);
        }
    }
}
