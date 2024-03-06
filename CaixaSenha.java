package BoloDeFubá;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class CaixaSenha extends JFrame implements ActionListener
{
JLabel L1,L2;
JTextField TF1;JPasswordField PW;
public static void main(String args [])
{
JFrame JCSenha = new CaixaSenha();
JCSenha.setVisible(true);
}
CaixaSenha()
{
setTitle ("Verifica Senha");
setSize(350,100);
setLocation(300,300);
getContentPane().setBackground(Color.cyan);
getContentPane().setLayout(new GridLayout(2,2));
L1 = new JLabel("Digite a Senha: "); L1.setForeground(Color.black);
L2 = new JLabel("Validação: "); L2.setForeground(Color.black);
L1.setFont(new Font(" ",Font.BOLD,14));
L2.setFont(new Font(" ",Font.BOLD,14));
TF1 = new JTextField(); TF1.setForeground(Color.red);
PW = new JPasswordField();
PW.setEchoChar('*'); //echo dos caracteres *
PW.addActionListener(this); //objeto PW JPasswordField
getContentPane().add(L1); //add interface ActionListener <Enter>

getContentPane().add(PW);
getContentPane().add(L2);
getContentPane().add(TF1);
}
public void actionPerformed(ActionEvent e)
{
if(new String(PW.getPassword()).equals("FITO"))
{
TF1.setText("Senha Valida");

JFrame JArquivo = new ExArquivoTxt();
JArquivo.setVisible(true);
}
else
TF1.setText("Senha Invalida");

}}