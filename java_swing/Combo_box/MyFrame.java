package Combo;
import javax.swing.*;
import java.awt.*;
import javax.swing.JComboBox;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{
    String[] opcoes = {"array 1","opção 2","ops 3"};
    JComboBox escolhas = new JComboBox(opcoes); 
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        escolhas.addActionListener(this);
        //para editar escohas
        //escolhas.setEditable(true);
        this.setLayout(new FlowLayout());
        this.setTitle("combo box");
        this.add(escolhas);
        this.pack();
        this.setVisible(true);
    } 
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==escolhas){
            System.out.println(escolhas.getSelectedItem());
            System.out.println(escolhas.getSelectedIndex());
        }
    }
}
