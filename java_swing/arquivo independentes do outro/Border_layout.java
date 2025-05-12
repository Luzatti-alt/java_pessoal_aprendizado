import javax.swing.*;
import java.awt.*;
public class Border_layout extends JFrame{
    public void lay(){
        //as layouts são divididas north,south,center,west,east ex:
        JFrame principal_janela = new JFrame();
        principal_janela.setLayout(new BorderLayout(5,5));//um uso da border layout como uma margem
        JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);//canto
		panel2.setBackground(Color.green);//canto
		panel3.setBackground(Color.yellow);//canto
		panel4.setBackground(Color.magenta);//canto
		panel5.setBackground(Color.blue);//meio /subpainel
		
		panel5.setLayout(new BorderLayout());
				
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(150,100));
		panel3.setPreferredSize(new Dimension(150,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
        //new BorderLayout(witdh, height)//é tipo uma margem 
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);
		
		panel5.setLayout(new BorderLayout());
        //painel central que agr acomoda os subpaineis/algo parecido com o que fazemos com o 
        //layout padrão porem contido no panel 5
        //comente esta parte de baixo para entender melhor
        /* */
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
	
		panel5.add(panel6,BorderLayout.NORTH);//escala horizontalmente
		panel5.add(panel7,BorderLayout.SOUTH);//escala horizontalmente
		panel5.add(panel8,BorderLayout.WEST);//escala vertilmente
		panel5.add(panel9,BorderLayout.EAST);//escala verticalmente
		panel5.add(panel10,BorderLayout.CENTER);//escala proporionalmente
		// */
        principal_janela.add(panel1,BorderLayout.NORTH);//escala horizontalmente
		principal_janela.add(panel2,BorderLayout.WEST);//escala horizontalmente
		principal_janela.add(panel3,BorderLayout.EAST);//escala verticalmente
		principal_janela.add(panel4,BorderLayout.SOUTH);//escala verticalmente
		principal_janela.add(panel5,BorderLayout.CENTER);//escala proporionalmente
        
        principal_janela.setBackground(new Color(52, 177, 235));
        principal_janela.setTitle("border layouts");
        principal_janela.setSize(1000, 500);
        principal_janela.setVisible(true);
        principal_janela.setMinimumSize(new Dimension(600, 400));
        principal_janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
    public static void main(String[]args){
        System.out.println("abriu");
        Border_layout mainFrame = new Border_layout();
        mainFrame.lay();
    }}
