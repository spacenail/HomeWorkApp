import javax.swing.*;
import java.awt.*;

public class CalculatorWindow extends JFrame {
    public CalculatorWindow(){
        setTitle("Calculator 3000");
        setBounds(600,200,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(createMenuBar());
        add(createTopPanel(),BorderLayout.NORTH);
        add(createBottomPanel(), BorderLayout.CENTER);
        add(createWestPanel(), BorderLayout.EAST);
        setVisible(true);
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        textField.setEditable(false);
        top.add(textField,BorderLayout.CENTER);
        return top;
    }

    private JPanel createBottomPanel(){
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(4,3));
        for (int i = 1; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            bottom.add(btn);
        }

        JButton clear = new JButton("C");
        bottom.add(clear);

        JButton zero = new JButton("0");
        bottom.add(zero);

        JButton calc = new JButton("=");
        bottom.add(calc);

        return bottom;
    }

    private JPanel createWestPanel(){
        JPanel west = new JPanel();
        west.setLayout(new GridLayout(4,1));
        JButton multiply = new JButton("*");
        west.add(multiply);
        JButton summary = new JButton("+");
        west.add(summary);
        JButton subtraction = new JButton("-");
        west.add(subtraction);
        JButton divide = new JButton("/");
        west.add(divide);
        return west;
    }

    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
        menuBar.add(file);
        return menuBar;
    }
}
