package Troca_janelas;
import javax.swing.*;
import java.awt.*;
public class NewWindow extends JFrame{
    JFrame principal_janela = new JFrame();
    NewWindow(){
        principal_janela.setBackground(new Color(52, 177, 235));
        principal_janela.setTitle("Nova janela");
        principal_janela.setSize(1000, 500);
        principal_janela.setVisible(true);
        principal_janela.setMinimumSize(new Dimension(600, 400));
        principal_janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
   public static void main(String[]args){
    System.out.println("foi?");
   }
}