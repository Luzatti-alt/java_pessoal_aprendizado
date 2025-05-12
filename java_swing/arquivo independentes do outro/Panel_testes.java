import javax.swing.*;
//import javax.swing.border.*;
import java.awt.*;
public class Panel_testes extends JFrame{
    public void panel_testes(){
        JLabel text_1 = new JLabel();
        text_1.setText("oi");
        text_1.setForeground(new Color(255,255,255));
        text_1.setHorizontalAlignment(JLabel.CENTER);
        text_1.setVerticalAlignment(JLabel.CENTER);
        JLabel text_2 = new JLabel();
        text_2.setText("eai");
        text_2.setForeground(new Color(255,255,255));
        text_2.setHorizontalAlignment(JLabel.CENTER);
        text_2.setVerticalAlignment(JLabel.CENTER);
        JLabel text_3 = new JLabel();
        text_3.setText("hey");
        text_3.setForeground(new Color(255,255,255));
        text_3.setHorizontalAlignment(JLabel.CENTER);
        text_3.setVerticalAlignment(JLabel.CENTER);
        JPanel panel_verm = new JPanel();//eu ja estava usando uma parte do panel ao invez de usar o JFrame
        panel_verm.setLayout(new BorderLayout());
        panel_verm.setBackground(new Color(255,0,0));
        panel_verm.setBounds(0,0,250,250);//x,y,witdh, height
        JPanel panel_azul = new JPanel();//eu ja estava usando uma parte do panel ao invez de usar o JFrame
        panel_azul.setLayout(new BorderLayout());//sem isso o alinhamento nn funciona
        //se trocar para null seria o mesmo que nn ter esse gerenciamento e teria que gerar o bounds para a label ao invez
        //do panel porem nn é a maneira mais facil para posicional é bom quando não é top,down,let,right e sim algo mais pixel precision
        panel_azul.setBackground(new Color(0,0,255));
        panel_azul.setBounds(250,0,250,250);//x,y,witdh, height
        JPanel panel_duende = new JPanel();//eu ja estava usando uma parte do panel ao invez de usar o JFrame
        panel_duende.setLayout(new BorderLayout());
        panel_duende.setBackground(new Color(0,255,0));
        panel_duende.setBounds(0,250,500,250);//x,y,witdh, height
       
        //lembre de alterar a posição x/y senão o de cima sobrepõe o outro panel

        //abaixo daqui é conteudos ja vistos do swing
        JFrame principal_janela = new JFrame();
        principal_janela.add(panel_verm);
        principal_janela.add(panel_azul);
        principal_janela.add(panel_duende);
        panel_duende.add(text_3);
        panel_azul.add(text_2);
        panel_verm.add(text_1);
        principal_janela.setSize(600, 500);
        principal_janela.setLayout(null);//pois iremos definir o layout manualmente
        principal_janela.setTitle("Panels");
        principal_janela.setVisible(true);
        principal_janela.setMinimumSize(new Dimension(600, 400));
        principal_janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        System.out.println("abriu");
        Panel_testes mainFrame = new Panel_testes();//com isso ele garante que vai funcionar
        mainFrame.panel_testes();
    }
}
