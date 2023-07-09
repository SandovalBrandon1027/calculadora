/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    private JFrame frame;
    private JTextField display;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonEquals, buttonClear;

    private double firstNumber;
    private String operator;

    public Calculadora() {
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        button7 = createNumberButton("7");
        button8 = createNumberButton("8");
        button9 = createNumberButton("9");
        buttonDivide = createOperatorButton("/");
        button4 = createNumberButton("4");
        button5 = createNumberButton("5");
        button6 = createNumberButton("6");
        buttonMultiply = createOperatorButton("*");
        button1 = createNumberButton("1");
        button2 = createNumberButton("2");
        button3 = createNumberButton("3");
        buttonMinus = createOperatorButton("-");
        button0 = createNumberButton("0");
        buttonClear = createClearButton();
        buttonEquals = createEqualsButton();
        buttonPlus = createOperatorButton("+");

        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(button0);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonEquals);
        buttonPanel.add(buttonPlus);

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private JButton createNumberButton(String number) {
        JButton button = new JButton(number);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = display.getText();
                display.setText(currentText + number);
            }
        });
        return button;
    }

    private JButton createOperatorButton(String op) {
        JButton button = new JButton(op);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = display.getText();
                firstNumber = Double.parseDouble(currentText);
                operator = op;
                display.setText("");
            }
        });
        return button;
    }

    private JButton createClearButton() {
        JButton button = new JButton("C");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        return button;
    }

    private JButton createEqualsButton() {
        JButton button = new JButton("=");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = display.getText();
                double secondNumber = Double.parseDouble(currentText);
                double result = 0;

                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        break;
                }

                display.setText(String.valueOf(result));
            }
        });
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora();
            }
        });
    }
}
*/