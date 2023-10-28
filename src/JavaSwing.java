import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class JavaSwing implements ActionListener {

    public static void main(String[] args) {


        JPanel panel = new JPanel(); //to je layout.. musime jako prvni vlozit okno na layout
        panel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setSize(350, 350); //frame je okno
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


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
}

        // button.setBounds();

        //password kolonka

        //user window where u will put input

    /*@Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Button Clicked");

    }
}
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = new String(pass.getPassword());

        // Přidejte kód pro uložení username a password do MongoDB kolekce
        Document document = new Document("username", username)
                .append("password", password);
        collection.insertOne(document);

        System.out.println("Data saved to MongoDB");
        import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

    }


     */
