package Lab_G;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularzStudenta extends JFrame {

    private JComboBox<String> imieBox;

    private JCheckBox sportBox, muzykaBox, gryBox;

    private JRadioButton kobietaBtn, mezczyznaBtn;

    private JTextField komentarzField;

    private JButton wyslijButton;

    private JLabel wynikLabel;

    public FormularzStudenta() {

        setTitle("Formularz Studenta");

        setSize(400, 300);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        imieBox = new JComboBox<>(new String[]{"Asia", "Burek", "Fagata"});

        sportBox = new JCheckBox("Sport");

        muzykaBox = new JCheckBox("Muzyka");

        gryBox = new JCheckBox("Gry");

        kobietaBtn = new JRadioButton("Kobieta");

        mezczyznaBtn = new JRadioButton("Mężczyzna");

        ButtonGroup plecGroup = new ButtonGroup();

        plecGroup.add(kobietaBtn);

        plecGroup.add(mezczyznaBtn);

        komentarzField = new JTextField(20);

        wyslijButton = new JButton("Wyślij");

        wynikLabel = new JLabel("Tutaj pojawi się wynik");

        add(new JLabel("Imię:"));

        add(imieBox);

        add(new JLabel("Zainteresowania:"));

        add(sportBox);

        add(muzykaBox);


        add(gryBox);

        add(new JLabel("Płeć:"));

        add(kobietaBtn);

        add(mezczyznaBtn);

        add(new JLabel("Komentarz:"));

        add(komentarzField);


        add(wyslijButton);

        add(wynikLabel);

        wyslijButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String imie = (String) imieBox.getSelectedItem();

                StringBuilder zainteresowania = new StringBuilder();

                if (sportBox.isSelected()) {

                    zainteresowania.append("sport, ");

                }


                if (muzykaBox.isSelected()) {

                    zainteresowania.append("muzyka, ");

                }

                if (gryBox.isSelected()) {

                    zainteresowania.append("gry, ");

                }

                if (zainteresowania.length() > 0) {

                    zainteresowania.setLength(zainteresowania.length() - 2);

                }

                String plec = kobietaBtn.isSelected() ? "Kobieta" :

                mezczyznaBtn.isSelected() ? "Mężczyzna" : "";

                String komentarz = komentarzField.getText();

                String wynik = String.format("%s (%s), interesuje się: %s. Komentarz: %s",imie, plec, zainteresowania.toString(), komentarz);

                wynikLabel.setText(wynik);

            }

        });

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new FormularzStudenta().setVisible(true);

        });

    }
}