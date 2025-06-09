import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Coder extends JFrame implements ComponentListener{
    int largura_atual = this.getWidth();
    int altura_atual = this.getHeight();
    JPanel fundo = new JPanel();
    JPanel arquivos = new JPanel();
    JPanel terminal = new JPanel();
    JPanel editor = new JPanel();
    public Coder(){
        this.setMinimumSize(new Dimension(500,500));
        this.add(fundo);
        fundo.setLayout(null);
        fundo.setBackground(Color.BLACK);
        fundo.add(terminal);
        fundo.add(arquivos);
        fundo.add(editor);
        this.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
        int largura_atual = Coder.this.getWidth();
        int altura_atual = Coder.this.getHeight();
        terminal.setLocation(largura_atual, altura_atual);
        terminal.setBounds(0+(largura_atual/3),altura_atual-(altura_atual/3),largura_atual-(altura_atual/3),altura_atual/3);
        arquivos.setBounds(0,0,largura_atual/3, altura_atual);
        editor.setBounds(0+(largura_atual/3),0,0,0);
        fundo.revalidate();
        fundo.repaint();
    }});
        editor.setBackground(Color.green);
        arquivos.setBackground(Color.blue);
        terminal.setBackground(Color.red);
        this.setVisible(true);
    }
    @Override
public void componentResized(ComponentEvent e) {}
@Override
public void componentMoved(ComponentEvent e) {}
@Override
public void componentShown(ComponentEvent e) {}
@Override
public void componentHidden(ComponentEvent e) {}
    public static void main(String[]args){
        new Coder();
    }
}
