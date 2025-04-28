//min abrir janela java swing trocar nome das classes dai
import javax.swing.*;

import java.awt.*;
public class Flow extends JFrame{
    JFrame principal_janela = new JFrame();
    public void Flowlay(){
//Flow layout = componentes da janela lado a lado com tamnhos diversos
//se ele horizontalmente não tem o espaço necessario o flowlayout usará
//a proxima linha manipule o tamanho da janela para entender melhor
        //outro jeito de se fazer jbutton .add(new jbutton("texto do botão"));
        principal_janela.setLayout(new FlowLayout());//tem que ser set layout
        //new flowlayout(.leading/center/trailing,int horizontal,int vertical)fica na esquerd,MEIO,direita
        //os int é o espaçamento do lado(vertical/horizontal)
        //panels usam o flowlayout por padrão
        principal_janela.add(new JButton("1"));
        principal_janela.add(new JButton("2"));
        principal_janela.add(new JButton("3"));
        principal_janela.add(new JButton("4"));
        principal_janela.add(new JButton("5"));
        principal_janela.add(new JButton("6"));
        principal_janela.add(new JButton("7"));
        principal_janela.add(new JButton("8"));
        principal_janela.add(new JButton("9"));
        //
        principal_janela.setBackground(new Color(52, 177, 235));
        principal_janela.setTitle("Flow layout");
        principal_janela.setSize(1000, 500);
        principal_janela.setVisible(true);
        principal_janela.setMinimumSize(new Dimension(100, 400));
        principal_janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        System.out.println("abriu");
        Flow mainFrame = new Flow();
        mainFrame.Flowlay();
    }
}
