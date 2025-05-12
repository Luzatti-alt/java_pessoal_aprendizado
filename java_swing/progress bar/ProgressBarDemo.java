package Barra_progresso;
import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
    JFrame janela = new JFrame();
    JProgressBar barra = new JProgressBar();//min e max value aqui
    //construct com noome da classe
    ProgressBarDemo(){
        janela.getContentPane().setBackground(Color.gray);
        barra.setValue(100);//valor inicial da barra(0=100 %)
        //por padrão a barra ja enche pelo percentual
        // e por padrão a barra é azul 
        barra.setBounds(0,0,500,100);
        barra.setStringPainted(true);//add percentual
        barra.setForeground(Color.green);
        barra.setBackground(Color.black);
        //barra.setString("terminado");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500,900);
        janela.setLayout(null);
        janela.setVisible(true);
        janela.setTitle("barra de progresso");
        janela.add(barra);
        //adicionar a barra ao frame
        fill();//metodo fill
    }
    public void fill(){
        int tempo = 0;
        while(tempo<=100){
            barra.setValue(tempo);
            try{
                Thread.sleep(250);//timer 1 seg
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            barra.setString("em progresso: "+ tempo +"%");
            tempo += 1;//valor da prograssão
            //vel da progressão pode variar com o valor de tempo ou thread.sleep
        }
        barra.setString("terminado");
    }
}
