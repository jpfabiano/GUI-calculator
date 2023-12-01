import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiCalculadora extends JFrame {
    private JButton jb1, jb2, jb3, jb4, jb5, jb6 , jb7, jb8, jb9, jb0,
            jbAdicao, jbSubtracao, jbMultiplicacao, jbDivisao, jbAC, jbPonto, jbIgual;
    private JLabel jlVisor, jlnumeroDigitado;
    private static GuiCalculadora frame;

    public GuiCalculadora(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes(){
        setTitle("Calculadora");
        setBounds(0,0,250,300);
        setLayout(null);
        jb1 = new JButton("1");
        jb2 = new JButton("2");
        jb3 = new JButton("3");
        jb4 = new JButton("4");
        jb5 = new JButton("5");
        jb6 = new JButton("6");
        jb7 = new JButton("7");
        jb8 = new JButton("8");
        jb9 = new JButton("9");
        jb0 = new JButton("0");
        jbAdicao = new JButton("+");
         jbMultiplicacao = new JButton("x");
         jbSubtracao = new JButton("-");
         jbDivisao = new JButton("/");
         jbAC = new JButton("AC");
         jbPonto = new JButton(".");
         jbIgual = new JButton("=");
         jlVisor = new JLabel("0",JLabel.RIGHT);
        jlnumeroDigitado = new JLabel("");
        jlVisor.setFont(new Font("Arial",Font.BOLD,20) );
        jlnumeroDigitado.setFont(new Font("Arial",Font.BOLD,15) );
        //linha1 - Visor AC
        jlVisor.setBounds(100,0,100,40);
        jlnumeroDigitado.setBounds(70,0,100,40);
        jbAC.setBounds(8,5,50,30);
        //linha2 - 7 8 9 /
        jb7.setBounds(8,60,50,30);
        jb8.setBounds(63,60,50,30);
        jb9.setBounds(118,60,50,30);
        jbDivisao.setBounds(173,60,50,30);
        //linha3 - 4 5 6 x
        jb4.setBounds(8,95,50,30);
        jb5.setBounds(63,95,50,30);
        jb6.setBounds(118,95,50,30);
        jbMultiplicacao.setBounds(173,95,50,30);
        //linha4 - 1 2 3 -
        jb1.setBounds(8,130,50,30);
        jb2.setBounds(63,130,50,30);
        jb3.setBounds(118,130,50,30);
        jbSubtracao.setBounds(173,130,50,30);
        //linha5 - 0 . = +
        jb0.setBounds(8,165,50,30);
        jbPonto.setBounds(63,165,50,30);
        jbIgual.setBounds(118,165,50,30);
        jbAdicao.setBounds(173,165,50,30);
        add(jbAC);
        add(jlVisor);
        add(jlnumeroDigitado);
        add(jb7);
        add(jb8);
        add(jb9);
        add(jbDivisao);
        add(jb4);
        add(jb5);
        add(jb6);
        add(jbMultiplicacao);
        add(jb1);
        add(jb2);
        add(jb3);
        add(jbSubtracao);
        add(jb0);
        add(jbPonto);
        add(jbIgual);
        add(jbAdicao);
    }
    String obterValor = "";
    float n1 = 0, n2 = 0, r = 0;
    char operacao;
    public void definirEventos(){
        jb1.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                 obterValor = obterValor.concat("1");
                 jlVisor.setText(""+obterValor);
            }
        });
        jb2.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat("2");
                jlVisor.setText(""+obterValor);
            }
        });
        jb3.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat("3");
                jlVisor.setText(""+obterValor);
            }
        });
        jb4.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat("4");
                jlVisor.setText(""+obterValor);
            }
        });
        jb5.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat("5");
                jlVisor.setText(""+obterValor);
            }
        });
        jb6.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat("6");
                jlVisor.setText(""+obterValor);
            }
        });
        jb7.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat("7");
                jlVisor.setText(""+obterValor);
            }
        });
        jb8.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat("8");
                jlVisor.setText(""+obterValor);
            }
        });
        jb9.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat("9");
                jlVisor.setText(""+obterValor);
            }
        });
        jb0.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat("0");
                jlVisor.setText(""+obterValor);
            }
        });
        jbPonto.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                obterValor = obterValor.concat(".");
                jlVisor.setText(""+obterValor);
            }
        });
        jbAdicao.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                operacao = '+';
                if(n1!=0) {
                    n2 = Float.parseFloat(obterValor);
                } else {
                    n1 = Float.parseFloat(obterValor);
                }
                obterValor = "";
                jlVisor.setText(""+operacao);
                jlnumeroDigitado.setText(""+n1+operacao);
            }
        });
        jbSubtracao.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                operacao = '-';
                if(n1!=0) {
                    n2 = Float.parseFloat(obterValor);
                } else {
                    n1 = Float.parseFloat(obterValor);
                }
                obterValor = "";
                jlVisor.setText(""+operacao);
                jlnumeroDigitado.setText(""+n1+operacao);
            }
        });
        jbMultiplicacao.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                operacao = '*';
                if(n1!=0) {
                    n2 = Float.parseFloat(obterValor);
                } else {
                    n1 = Float.parseFloat(obterValor);
                }
                obterValor = "";
                jlVisor.setText(""+operacao);
                jlnumeroDigitado.setText(""+n1+operacao);
            }
        });
        jbDivisao.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                operacao = '/';
                if(n1!=0) {
                    n2 = Float.parseFloat(obterValor);
                } else {
                    n1 = Float.parseFloat(obterValor);
                }
                obterValor = "";
                jlVisor.setText(""+operacao);
                jlnumeroDigitado.setText(""+n1+operacao);
            }
        });
        jbAC.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                n1 = 0;
                n2 = 0;
                r = 0;
                jlVisor.setText("0");
                obterValor = "";
            }
        });
        jbIgual.addActionListener (new ActionListener (){
            public void actionPerformed(ActionEvent e){
                if(n1!=0) {
                    n2 = Float.parseFloat(obterValor);
                } else {
                    n1 = Float.parseFloat(obterValor);
                }
                switch (operacao){
                    case '+':
                        r = n1 + n2;
                        break;
                    case '-':
                        r = n1 - n2;
                        break;
                    case '*':
                        r = n1 * n2;
                        break;
                    case '/':
                        if (n2 == 0){
                            r = 0;
                        }
                        r = n1 / n2;
                        break;
                }
                jlVisor.setText(""+r);
                jlnumeroDigitado.setText("");
                obterValor = String.valueOf(r);
                n1 = r;
                n2 = 0;
            }
        });
    }

    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new GuiCalculadora();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela =  Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2,
                        (tela.height - frame.getSize().height)/2);
                frame.setVisible(true);
            }
        });
    }
}
