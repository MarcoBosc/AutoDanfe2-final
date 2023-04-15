package Components;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;
import java.awt.Dimension;


public class FormattedDateEntry extends JPanel {
    private final JFormattedTextField field;

    public FormattedDateEntry() {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter("##/##/####");
            formatter.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        field = new JFormattedTextField(formatter);
        field.setBackground(Color.WHITE); // Define a cor de fundo como branco
        field.setColumns(8);
        field.setPreferredSize(new Dimension(field.getPreferredSize().width, 33));
        add(field);
    }

    public String getDate() {
        return field.getText();
    }

    public void setDate(String date) {
        field.setValue(date);
    }
}
