import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Buttons extends JFrame implements ActionListener{
    JFrame principal_janela = new JFrame();
    JButton botao;//coloca botao como global assim os eventos rão funcionar
    //mais facil deizar o = new Jbutton aqui em cima que tbm vai funcionar 
    public void butao_testes(){
        botao = new JButton();//no tutorial dizia aqui
        //porem é melhor deixar o botaoo na pare global
        botao.setBounds(350,150,250,150);
        botao.addActionListener(this);//ou e-> system.ouy.println(java lambda)
        botao.setText("butão aqui");//remover a borda no texto
        //set icon funciona no botao tbm, o setposition
        //ImageIcon icon = new Imageicon(path);
        botao.setFocusable(false);
        botao.setBackground(new Color(100,100,100));
        botao.setForeground(Color.WHITE);//cor texto botao
        //botao.setEnable(T/F);ativa ou desativa botao se usar isso no actionperformaced ele vira 
        //um botao que pode ser ativado uma vez
        //um exemplo util e ativar a visibilidade de um panel assim que o botao for clicado
        //sem isto o system.out funciona mas nn aparece no terminal neste caso
        principal_janela.add(botao);
        principal_janela.setLayout(null);
        principal_janela.setBackground(new Color(52, 177, 235));
        principal_janela.setTitle("botões");
        principal_janela.setSize(1000, 500);
        principal_janela.setVisible(true);
        principal_janela.setMinimumSize(new Dimension(600, 400));
        principal_janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }int state = 0;
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botao){
            state++;
            System.out.println("apertou");
            System.out.println("state: "+state);
            if(state == 1){
                principal_janela.getContentPane().setBackground(new Color(0, 0, 0));
            }else if(state ==2){
                principal_janela.getContentPane().setBackground(new Color(255, 255, 255));
                state = 0;
            }
        }//botao esta como local ao inves de global
        //procura os eventos(botão sendo precionada)
    }
    public static void main(String[]args){
        System.out.println("abriu");
        Buttons mainFrame = new Buttons();//com isso ele garante que vai funcionar
        mainFrame.butao_testes();
         /*Panel_testes mainFrame = new Panel_testes();//com isso ele garante que vai funcionar
        mainFrame.panel_testes(); */
    }
}
