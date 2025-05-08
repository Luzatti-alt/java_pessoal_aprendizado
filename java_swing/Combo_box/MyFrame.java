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
        //adicionar novo item
        escolhas.addItem("novo item");
        //remover itens
        //escolhas.removeItem("array 1");
        //da para utilizar removeItemAt
        //remove all exite ex escolhas.removeAllItens()
        //lugar do item
        escolhas.insertItemAt("top 1",0);//começa por 0
        escolhas.setSelectedIndex(2);//onde fica localizado a opção qnd ainda nn foi escolhido
        //sempre coloque no fim do código para realmente ficar localizado onde vc quer
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
