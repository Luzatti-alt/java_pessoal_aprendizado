//min abrir janela java swing trocar nome das classes dai
import javax.swing.*;
import java.awt.*;
public class Layers extends JFrame{
    //JlayeredPanel camadas/containers em 3d
    public void aaa(){
        JFrame principal_janela = new JFrame();
        JLabel camada_1 = new JLabel();
        camada_1.setOpaque(true);
        camada_1.setBackground(Color.RED);
        camada_1.setBounds(50,50,100,100);
        JLabel camada_2 = new JLabel();
        camada_2.setOpaque(true);
        camada_2.setBackground(Color.BLUE);
        camada_2.setBounds(100,100,100,100);
        JLabel camada_3 = new JLabel();
        camada_3.setOpaque(true);
        camada_3.setBackground(Color.GREEN);
        camada_3.setBounds(150,150,100,100);

        JLayeredPane layer = new JLayeredPane();
        //ordem layer(trás p/frente):default,palette,modal,popUp,Drag
        layer.setBounds(0,0,500,500);//x,y,l,h
        //layer.add(camada_1,JLayeredPane.DEFAULT_LAYER);
        //layer.add(camada_2,JLayeredPane.DEFAULT_LAYER);
        //layer.add(camada_3,JLayeredPane.DRAG_LAYER);
        //ou 
        layer.add(camada_1, Integer.valueOf(0));//nn dá para por so o num deve ser assim
        layer.add(camada_2, Integer.valueOf(1));//maior número é a camada mais afrente
        layer.add(camada_3, Integer.valueOf(0));
        principal_janela.add(layer);
        //layers
        principal_janela.setLayout(null);
        principal_janela.setBackground(new Color(52, 177, 235));
        principal_janela.setTitle("layers");
        principal_janela.setSize(1000, 500);
        principal_janela.setVisible(true);
        principal_janela.setMinimumSize(new Dimension(600, 400));
        principal_janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        System.out.println("abriu");
        Layers mainFrame = new Layers();
        mainFrame.aaa();
    }
}
