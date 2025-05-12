import javax.swing.*;
public class Text_box extends JFrame{
    public static void main(String[]args){
        System.out.println("abriu");
        //está null por não termos um 
        //mensagem
        //titulo
        //message type = italico,negrito, etc 
        //os tipos de mensagem então abaixo descomente o que vc quer ver
        //e comente o resto
        
        //se estiver no while mesmo se fechar ele nn vai desaparecer
        //JOptionPane.showMessageDialog(null,"oi","titulo", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"oi","titulo", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"oi","titulo", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"oi","titulo", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"oi","titulo", JOptionPane.ERROR_MESSAGE);
        
        //é possivel utilizar com input
        
        //int valor = JOptionPane.showConfirmDialog(null,"diga sim ou não","titulo",JOptionPane.YES_NO_CANCEL_OPTION);
        //não 0 sim 1 cancel 3 
        //String texto = JOptionPane.showInputDialog("pergunta: ");
        //v2 do input do popup mais customizavel
        String[] resp ={"sla ","outra opção","opção 3","teste se mais de 3 opções funciona" };
        JOptionPane.showOptionDialog(
            null,
            "sla",
            "abc",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            resp,//array com as seleções
            0//valor padrão
            );
        
        //System.out.println("sim:1 não:1 cancel:3 escolheu "+valor);
        //System.out.println("texto digitado é "+texto);
        //criar lista dos messages type
    }
}
