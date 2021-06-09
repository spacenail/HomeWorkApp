import javax.swing.*;
import java.awt.*;

public class CalculatorWindow extends JFrame {
    private JTextField inputArea;
    private Font font = new Font(Font.SANS_SERIF,0,20);

    public CalculatorWindow(){
        setFont(font);
        setTitle("Calculator 3000");
        setBounds(600,200,300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(createMenuBar());
        setLayout(new BorderLayout());
        add(createTopPanel(),BorderLayout.NORTH);
        add(createBottomPanel(), BorderLayout.CENTER);
        add(createEastPanel(), BorderLayout.EAST);
        setVisible(true);
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputArea = new JTextField();
        inputArea.setEditable(false);
        inputArea.setText("");
        inputArea.setFont(font);
        top.add(inputArea,BorderLayout.CENTER);
        return top;
    }

    private JPanel createBottomPanel(){
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(4,3));
        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(inputArea);
        for (int i = 1; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.setFont(font);
            btn.addActionListener(digitButtonActionListener);
            bottom.add(btn);
        }

        JButton clear = new JButton("C");
        clear.addActionListener(e -> inputArea.setText(""));
        clear.setFont(font);
        bottom.add(clear);

        JButton zero = new JButton("0");
        zero.addActionListener(digitButtonActionListener);
        zero.setFont(font);
        bottom.add(zero);

        JButton calc = new JButton("=");
        calc.setFont(font);
        bottom.add(calc);

        return bottom;
    }

    private JPanel createEastPanel(){
        JPanel west = new JPanel();
        west.setLayout(new GridLayout(4,1));
        JButton multiply = new JButton("*");
        multiply.setFont(font);
        west.add(multiply);
        JButton summary = new JButton("+");
        summary.setFont(font);
        west.add(summary);
        JButton subtraction = new JButton("-");
        subtraction.setFont(font);
        west.add(subtraction);
        JButton divide = new JButton("/");
        divide.setFont(font);
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
