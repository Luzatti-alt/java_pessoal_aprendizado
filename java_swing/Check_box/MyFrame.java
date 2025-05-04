package CheckBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame  extends JFrame implements ActionListener{
    JCheckBox caixa = new JCheckBox();
    JButton botão = new JButton();
    MyFrame(){
        botão.setText("mandar");
        botão.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        caixa.setText("verifique");
        caixa.setFocusable(false);//tira o entorno no texto
        this.add(caixa);
        this.add(botão);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botão){
            System.out.println(caixa.isSelected());
        }
    }
}