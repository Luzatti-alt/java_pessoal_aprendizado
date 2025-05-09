package sliders;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
public class SliderDemo implements ChangeListener{
    JFrame janela;
    JPanel painel;
    JLabel label;
    JSlider slider;
    SliderDemo(){
        janela = new JFrame("slider");
        painel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);//ranges(min,max,valor inicial) 
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);//muda a cor do valor selecionado
        slider.setMinorTickSpacing(10);//impressão da onde está o número
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);//mostra os valores do majorTick 
        //por padrão é horizontal o slide
        slider.setOrientation(SwingConstants.VERTICAL);//muda da horizontal para vertical
        //ou troque o VERTICAL por HORIZONTAL
        slider.addChangeListener(this);//permite o valor ser atualizado
        label.setText("Temperatura(C°):"+ slider.getValue());
        painel.add(slider);
        painel.add(label);
        janela.add(painel);
        janela.setSize(1000, 500);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    //change listenet updata quando ha mudança
    public void stateChanged(ChangeEvent e){
        label.setText("Temperatura(C°):"+ slider.getValue());
        //valor é atualizado
    }
}