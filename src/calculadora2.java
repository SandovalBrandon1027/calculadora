import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora2 extends JDialog {
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
    private JButton raizCuadrada;
    private JButton potencia;
    private JButton tres;
    private JButton seis;
    private JButton nueve;
    private JButton punto;
    private JButton dividir;
    private JButton multiplicar;
    private JButton resta;
    private JButton suma;
    private JButton resultado;
    private JButton salir;
    private JButton seno;
    private JButton coseno;
    private JButton tangente;

    private String operador;
    private double primerNumero;
    private double segundoNumero;

    public calculadora2() {
        setContentPane(cuerpo);
        setModal(true);
        getRootPane().setDefaultButton(cero);

        cero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("0");
            }
        });
        uno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("1");
            }
        });
        dos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("2");
            }
        });
        tres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("3");
            }
        });

        cuatro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("4");
            }
        });
        cinco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("5");
            }
        });
        seis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("6");
            }
        });
        siete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("7");
            }
        });
        ocho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("8");
            }
        });
        nueve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("9");
            }
        });
        suma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("+");
            }
        });
        resta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("-");
            }
        });
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("*");
            }
        });
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("/");
            }
        });

        punto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero(".");
            }
        });

        resultado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("");
            }
        });

        raizCuadrada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularRaizCuadrada();
            }
        });

        potencia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularPotencia();
            }
        });

        seno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularSeno();
            }
        });

        coseno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularCoseno();
            }
        });

        tangente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularTangente();
            }
        });

        // Listener para el botón "Igual"
        resultado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });

        // Listener para el botón "Limpiar"
        borrartodo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarCalculadora();
            }
        });

        // Listener para el botón "Salir"
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void agregarNumero(String numero) {
        String textoActual = textPane1.getText();
        textPane1.setText(textoActual + numero);
    }

    private void calcularResultado() {
        String texto = textPane1.getText();

        // Buscar la posición del operador
        int indexOperador = texto.indexOf("+");
        if (indexOperador == -1) {
            indexOperador = texto.indexOf("-");
        }
        if (indexOperador == -1) {
            indexOperador = texto.indexOf("*");
        }
        if (indexOperador == -1) {
            indexOperador = texto.indexOf("/");
        }

        // Obtener el operador
        operador = texto.substring(indexOperador, indexOperador + 1);

        // Obtener los números antes y después del operador
        primerNumero = Double.parseDouble(texto.substring(0, indexOperador));
        segundoNumero = Double.parseDouble(texto.substring(indexOperador + 1));

        double resultado = 0;

        if (operador.equals("+")) {
            resultado = primerNumero + segundoNumero;
        } else if (operador.equals("-")) {
            resultado = primerNumero - segundoNumero;
        } else if (operador.equals("*")) {
            resultado = primerNumero * segundoNumero;
        } else if (operador.equals("/")) {
            resultado = primerNumero / segundoNumero;
        }

        textPane1.setText(String.valueOf(resultado));
    }

    private void calcularRaizCuadrada() {
        String texto = textPane1.getText();
        double numero = Double.parseDouble(texto);
        double resultado = Math.sqrt(numero);
        textPane1.setText(String.valueOf(resultado));
    }

    private void calcularPotencia() {
        String texto = textPane1.getText();
        double numero = Double.parseDouble(texto);
        double resultado = Math.pow(numero, 2);
        textPane1.setText(String.valueOf(resultado));
    }

    private void calcularSeno() {
        String texto = textPane1.getText();
        double numero = Double.parseDouble(texto);
        double resultado = Math.sin(numero);
        textPane1.setText(String.valueOf(resultado));
    }

    private void calcularCoseno() {
        String texto = textPane1.getText();
        double numero = Double.parseDouble(texto);
        double resultado = Math.cos(numero);
        textPane1.setText(String.valueOf(resultado));
    }

    private void calcularTangente() {
        String texto = textPane1.getText();
        double numero = Double.parseDouble(texto);
        double resultado = Math.tan(numero);
        textPane1.setText(String.valueOf(resultado));
    }

    private void limpiarCalculadora() {
        textPane1.setText("");
        operador = "";
        primerNumero = 0;
        segundoNumero = 0;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora2");
        frame.setContentPane(new calculadora2().cuerpo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
