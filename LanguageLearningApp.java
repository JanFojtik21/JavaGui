import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class LanguageLearningApp implements ActionListener {

    private JFrame frame;
    private JLabel germanWordLabel;
    private JTextField czechTranslationField;
    private JButton nextButton;
    private ArrayList<WordPair> wordPairs;
    private int currentWordIndex;

    private JButton historyButton;
    private JPanel historyPanel;



    public static void main(String[] args) {
        new LanguageLearningApp();
    }

    public LanguageLearningApp() {
        frame = new JFrame("Language Learning App");
        JPanel panel = new JPanel(new FlowLayout());
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        wordPairs = new ArrayList<>();
        // Přidejte německá slova a české významy do seznamu wordPairs
        wordPairs.add(new WordPair("Haus", "dům"));
        wordPairs.add(new WordPair("Auto", "auto"));
        wordPairs.add(new WordPair("ksicht", "das Gesicht"));
        wordPairs.add(new WordPair("fušer", "Pfuscher"));
        wordPairs.add(new WordPair("štempl", "der Stempel"));
        wordPairs.add(new WordPair("kšeftovat ", "die Geschäfte machen"));

        // Přidejte další slova...

        germanWordLabel = new JLabel();
        panel.add(germanWordLabel);


        czechTranslationField = new JTextField(20);
        panel.add(czechTranslationField);


        nextButton = new JButton("Další slovo");
        nextButton.addActionListener(this);
        panel.add(nextButton);

        historyButton = new JButton("History");
        historyButton.addActionListener(this);
        panel.add(historyButton);



        currentWordIndex = 0; //Nastavuji to na 0 - tímto si zajistím, že mi to ukáže první položku v listu.
        showNextWord();

        frame.setVisible(true);
    }


    private void addToHistory(String germanWord, String czechTranslation){
        historyPanel = new JPanel(new FlowLayout());
        frame.add(historyPanel);
        historyPanel.setVisible(true);
    }


    private void showNextWord() {

        if (currentWordIndex < wordPairs.size()) {
            WordPair wordPair = wordPairs.get(currentWordIndex);
            germanWordLabel.setText(wordPair.getGermanWord());
            czechTranslationField.setText("");
            nextButton.setEnabled(true);
        } else {
            germanWordLabel.setText("Konec slovíček");
            czechTranslationField.setEnabled(false);
            nextButton.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (currentWordIndex < wordPairs.size()) {
            WordPair wordPair = wordPairs.get(currentWordIndex);
            String userTranslation = czechTranslationField.getText().trim();
            if (userTranslation.equalsIgnoreCase(wordPair.getCzechTranslation())) {
                // Odpověď je správná
                currentWordIndex++;
                showNextWord();
            } else {
                // Odpověď je špatná
                czechTranslationField.setText("");
            }
        }
    }

    private class WordPair {
        private String germanWord;
        private String czechTranslation;

        public WordPair(String germanWord, String czechTranslation) {
            this.germanWord = germanWord;
            this.czechTranslation = czechTranslation;
        }

        public String getGermanWord() {
            return germanWord;
        }

        public String getCzechTranslation() {
            return czechTranslation;
        }
    }
}
