import javax.swing.*;//tudo do swing
import java.awt.*;//sem awt color dimension e border layout nn funcionam
public class MainFrame extends JFrame{  
    //def de Jframe = janela de gui que se é adicionado elementos 
    public void iniciar(){
        JPanel principal_janela = new JPanel();//cria o painel
        principal_janela.setLayout(new BorderLayout());//define a borda
        principal_janela.setBackground(new Color(52, 177, 235));//rgb
        //ou principal_janela.getContentPane().setBackground(a cor);//por meio do metodo new color(valor(rgb))
        //qnd tentei o outro metodo nn funcionou muito bem
        setTitle("nome janela aqui em cima");//titulo encima da janela
        add(principal_janela);//aplica cor de fundo
        setSize(1000, 500);//x,y tamanho aberto por padrão
        setMinimumSize(new Dimension(600, 400));
        //tamanho minimo p/janela
        //p/trocar a imagem na parte de cima da janela
        //ImageIcon logo = new ImageIcon("imagem.png");//diretorio ou nome do arquivo
        //setIconImagen(logo.getImage());

        //setResizable(false);//nn permite modificar o tamanho da tela
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //qnd apertar no x ele fecha se estiver exit se estiver hide ele não fecha o app
        //se estiver do_nothing_on_close ele nn vai fechar
        //Jlabel -> strings imagens etc
        setVisible(true);//com isso vai aparecer
    
    }
    public static void main(String[]args){
        MainFrame mainFrame = new MainFrame();//com isso ele garante que vai funcionar
        mainFrame.iniciar();//chama o processo da criação da tela
        //outro metodo sem estar no static void é usar o nome do Jpanel.____(exs:setsite,dimensions etc) 
    }
}
