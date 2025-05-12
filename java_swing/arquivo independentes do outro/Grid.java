import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
public class Grid extends JFrame{
    public void Grid_lay(){
        JFrame principal_janela = new JFrame();
        //botões anonimos 
        principal_janela.setLayout(new GridLayout(9,1));//padrão é ser armazenado por coluna
        //podemos definir qnts objs por linha em coluna numa grid
        //new gridlaytout(y,x,espaço horizontal,espaço vertical) o espaço é entre objs
        //coluna, linha(3,3 = 3x3 9,1 9x1 ordem )
        //da para aplicar em panel
        principal_janela.add(new JButton("1"));
        principal_janela.add(new JButton("2"));
        principal_janela.add(new JButton("3"));
        principal_janela.add(new JButton("4"));
        principal_janela.add(new JButton("5"));
        principal_janela.add(new JButton("6"));
        principal_janela.add(new JButton("7"));
        principal_janela.add(new JButton("8"));
        principal_janela.add(new JButton("9"));
        principal_janela.add(new JButton("10"));//o 10° adiciona uma nova coluna
        //mesmo ja tendo definido o layout da grid tenta deixar em pares para simetria

        principal_janela.setBackground(new Color(52, 177, 235));
        principal_janela.setTitle("Grid layout");
        principal_janela.setSize(1000, 500);
        principal_janela.setVisible(true);
        principal_janela.setMinimumSize(new Dimension(600, 400));
        principal_janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        System.out.println("abriu");
        Grid mainFrame = new Grid();
        mainFrame.Grid_lay();
    }
}
