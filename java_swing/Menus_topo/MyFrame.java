package Menus_topo;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
    JMenuBar Menu = new JMenuBar();
    //menu bar é a barra onde estarão os menus
    //jmenu são as abas pros menus
    //JmenuItem são as opçoes do menu/sub menu ou seja a funcionalidade
    JMenu arquivo = new JMenu("aba1(arquivo)");
    //nome da var p/salvar
    //"nome visivel ao usuario"
    JMenu edit = new JMenu("aba2(editar)");
    JMenu help = new JMenu("aba3(ajuda)");
    JMenuItem carregarItem = new JMenuItem("carregar");
    JMenuItem salve = new JMenuItem("salvar");
    JMenuItem tchau = new JMenuItem("sair");
    MyFrame(){ 
        //add sub itens
        arquivo.add(carregarItem);
        arquivo.add(salve);
        arquivo.add(tchau);
        //action listeners p/funcionalidade
        carregarItem.addActionListener(this);
        salve.addActionListener(this);
        tchau.addActionListener(this);
        //adiciona os elementos do menu do topo
        Menu.add(arquivo);
        Menu.add(edit);
        Menu.add(help);
        //adicionando atalhos do teclado
        //tem que estar em cima do tipo do menu
        //qnd apertar a tecla move ate a ação desejada
        //p/submenus só estar no menu certo apertar o 
        // atalho + enter
        carregarItem.setMnemonic(KeyEvent.VK_S);//keyevent + vk_tecla
        tchau.setMnemonic(KeyEvent.VK_F4);
        salve.setMnemonic(KeyEvent.VK_B);
        //p/menus é alt+tecla
        arquivo.setMnemonic(KeyEvent.VK_1);
        edit.setMnemonic(KeyEvent.VK_2);
        help.setMnemonic(KeyEvent.VK_3);
        //elementos pra janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setJMenuBar(Menu);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    } 
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==carregarItem){
            System.out.println("carregando");
        }if(e.getSource()==salve){
            System.out.println("salvando");
        }if(e.getSource()==tchau){
            System.out.println("saindo");
            System.exit(0);
        }
    }
}