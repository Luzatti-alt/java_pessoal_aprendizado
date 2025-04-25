import javax.swing.*;
import javax.swing.border.*;//subpacote então tem que importar tbm
//subpacotes nn são imprtados quando é pacote_main.*
import java.awt.*;
public class Labels_frame extends JFrame { 
    //parecido com o que foi feito anteriormente com jframe
    public void teste(){
        Border borda = BorderFactory.createLineBorder(Color.green,3);
        JLabel label_teste = new JLabel();//cria label
        label_teste.setBorder(borda);//essa foi a ideia porem era no todo ao invez do texto
        label_teste.setText("boa noite");//cria o conteudo de uma label
        //mesma logica para icon so muda para set.Icon(logo)
        //tbm precisa adicionar a visibilidade da label
        //entre str e imagens imagens ficam a esquerda e str a direita por preferencia
        //para obrigar o texto a ser estar numa posição especificar
        //label_teste.setHorizontalTextPosition(JLabel.RIGHT);//LEFT,CENTER,RIGHT
        //label_teste.setVerticalTextPosition(JLabel.BOTTOM);//TOP,CENTER,BOTTOM
        label_teste.setForeground(new Color(150,150,50));
        //label_teste.setFont("arial",Font.PLAIN,30);
        label_teste.setIconTextGap(-25);
        label_teste.setBackground(new Color(0, 0, 0));
        //def background jlabel previne que crie uma janela escura
        label_teste.setOpaque(true);//sem isso se mudar a cod do funco nn vai mudar
        label_teste.setFont(new Font("MV Boli",Font.PLAIN,30));
        JPanel principal_janela = new JPanel();
        //label_teste.setBounds(x,y,largura,altura);
        setLayout(new BorderLayout());
        setBackground(new Color(52, 177, 0));
        setTitle("testando labels");
        add(principal_janela);
        setSize(1000, 500);//x,y 
        setMinimumSize(new Dimension(600, 400));
        principal_janela.setBackground(new Color(0, 0, 0));//
        setVisible(true);
        //frame.pack();//resize de size of the frame
        principal_janela.add(label_teste);//Jframe.add(a_label);
        //se for so add(label); nn vai aparecer por padrão ele centraliza
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        Labels_frame mainFrame = new Labels_frame();//com isso ele garante que vai funcionar
        mainFrame.teste();
    }  
}
