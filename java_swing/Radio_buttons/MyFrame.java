package Radio_buttons;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    JRadioButton escolha_1 = new JRadioButton("escolha n°1");
    JRadioButton escolha_2 = new JRadioButton("escolha n°2");
    JRadioButton escolha_3 = new JRadioButton("escolha n°3");
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        escolha_1.addActionListener(this);
        escolha_2.addActionListener(this);
        escolha_3.addActionListener(this);
        this.add(escolha_1);
        this.add(escolha_2);
        this.add(escolha_3);
        ButtonGroup grupo = new ButtonGroup();//cria um grupo para assim poder escolher so um
        grupo.add(escolha_1);
        grupo.add(escolha_2);
        grupo.add(escolha_3);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==escolha_1){
            //tem que adicionar um action listener nas escolhas
            //pois sem isso mesmo se selecionado nn aparecera no terminal
            System.out.println("você ganhou um chocolate");
        }else if(e.getSource()==escolha_2){
            System.out.println("você ganhou uma água");
        }else if(e.getSource()==escolha_3){
            System.out.println("você ganhou um refri");
        }
    }
}