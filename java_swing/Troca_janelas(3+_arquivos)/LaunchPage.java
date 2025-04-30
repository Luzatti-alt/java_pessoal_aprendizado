package Troca_janelas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class LaunchPage implements ActionListener{
    JFrame janela = new JFrame();
    //so um botçao que ira mudar de janela
    JButton botão = new JButton("trocar janela");
    LaunchPage(){//constructor
        botão.setBounds(350,100,200,200);
        botão.setFocusable(false);//nn dar highlight qnd focar
        botão.addActionListener(this);
        janela.add(botão);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("janela lançamento");
        janela.setSize(1000, 500);
        janela.setLayout(null);
        janela.setVisible(true);
    }    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botão){
            //cria uma nova janela
            NewWindow MyWindow = new NewWindow();
            //p/abrir so uma janela 
            janela.dispose();//qnd apertado troca de janela e fecha a janela anterior
        }
        //aaa
    }
}