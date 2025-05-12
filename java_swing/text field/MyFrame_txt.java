import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame_txt extends JFrame implements ActionListener{
    JTextField campo_texto;
    JButton botão;
    MyFrame_txt(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        campo_texto = new JTextField();
        botão = new JButton("enviar");
        botão.addActionListener(this);
        this.add(botão);
        campo_texto.setPreferredSize(new Dimension(300,50));
        this.add(campo_texto);
        this.pack();//tamanho ajusta com elemento
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botão){
            System.out.println("aaa: "+ campo_texto.getText());
        }
    }
}
