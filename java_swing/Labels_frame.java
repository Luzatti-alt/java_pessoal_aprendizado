import javax.swing.*;
import java.awt.*;
public class Labels_frame extends JFrame { 
    //parecido com o que foi feito anteriormente com jframe
    public void teste(){
        JLabel label_teste = new JLabel();//cria label
        label_teste.setText("boa noite");//cria o conteudo de uma label
        //mesma logica para icon so muda para set.Icon(logo)
        //tbm precisa adicionar a visibilidade da label
        //entre str e imagens imagens ficam a esquerda e str a direita por preferencia
        //para obrigar o texto a ser estar numa posição especifica
        label_teste.setHorizontalTextPosition(JLabel.RIGHT);
        JPanel principal_janela = new JPanel();
        setLayout(new BorderLayout());
        setBackground(new Color(52, 177, 0));
        setTitle("testando labels");
        add(principal_janela);
        setSize(1000, 500);//x,y 
        setMinimumSize(new Dimension(600, 400));
        setVisible(true);
        principal_janela.add(label_teste);//Jframe.add(a_label);
        //se for so add(label); nn vai aparecer por padrão ele centraliza
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        Labels_frame mainFrame = new Labels_frame();//com isso ele garante que vai funcionar
        mainFrame.teste();
    }  
}