import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {
    private final JTextField inputField;

    public CalcButtonActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] operands = inputField.getText().split("[+-/*//]+");
        String[] preOperations = inputField.getText().split("[^+-/*//]+");
        String[] operations = new String[preOperations.length - 1];
        for (int i = 0; i < operations.length; i++) {
            operations[i] = preOperations[i + 1];
        }
        int summary = Integer.parseInt(operands[0]);
        for (int i = 1; i < operands.length; i++) {
            summary = mathOperation(summary,Integer.parseInt(operands[i]),operations[i-1]);
        }
        inputField.setText(String.valueOf(summary));
    }

    private int mathOperation(int a, int b, String operation) {
        int summary = a;
        switch (operation) {
            case ("+"):
                summary += b;
                break;
            case ("-"):
                summary -= b;
                break;
            case ("*"):
                summary *= b;
                break;
            case ("/"):
                summary /= b;
                break;
        }
        return summary;
    }
}
