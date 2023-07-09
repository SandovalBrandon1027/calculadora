import javax.swing.*;

public class calculadora2 {
    private JPanel cuerpo;
    private JTextPane textPane1;
    private JButton button1;
    private JButton cero;
    private JButton siete;
    private JButton ocho;
    private JButton cuatro;
    private JButton cinco;
    private JButton uno;
    private JButton dos;
    private JButton borrartodo;
    private JButton borrar;
    private JButton button11;
    private JButton tres;
    private JButton seis;
    private JButton nueve;
    private JButton button15;
    private JButton dividir;
    private JButton multiplicar;
    private JButton resta;
    private JButton suma;
    private JButton resultado;

    private double firstNumber;
    private String operator;


    



    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora2");
        frame.setContentPane(new calculadora2().cuerpo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
