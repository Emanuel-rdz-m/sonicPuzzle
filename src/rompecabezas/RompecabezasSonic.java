package rompecabezas;
import javax.swing.*;
import java.awt.event.*;

public class RompecabezasSonic extends JFrame implements ActionListener{
    private final JLabel etiqueta[] = new JLabel[4];
    private final MiBoton imagen[] = new MiBoton[4];
    private final Icon iconos[] = new Icon[4];
    private final Icon iconoF;

    public RompecabezasSonic() {
        getContentPane().setLayout(null);
        int X=20;
        iconoF = new ImageIcon("imagenes\\imgFondo.png");
        for(int i=0; i<4; i++){//imagenes de sonic
            imagen[i] = new MiBoton("");
            iconos[i] = new ImageIcon("imagenes\\img"+i+".png");
            imagen[i].setIcon(iconos[i]);
            
            imagen[i].setBounds(X,10,100,70);//posición y tamaño
            X+=110;
            imagen[i].addActionListener(this);
            add(imagen[i]);
            etiqueta[i] = new JLabel();
            add(etiqueta[i]);
            etiqueta[i].setIcon(iconoF);
        }
        //posicion de espacios
        etiqueta[0].setBounds(133,125,100,70);
        etiqueta[1].setBounds(234,125,100,70);
        etiqueta[2].setBounds(133,195,100,70);
        etiqueta[3].setBounds(234,195,100,70);
    }
    //verificación de posiciones
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == imagen[0]){
            System.out.println(imagen[0].getX()+","+imagen[0].getY());
            if(( (imagen[0].getX() >=129 && imagen[0].getX()<= 137) )&&
               ( (imagen[0].getY() >=120 && imagen[0].getY()<= 130) )){
                imagen[0].setVisible(false);
                etiqueta[0].setIcon(iconos[0]);
            }
        }
        if(e.getSource() == imagen[1]){
            System.out.println(imagen[1].getX()+","+imagen[1].getY());
            if(( (imagen[1].getX() >=229 && imagen[1].getX()<= 240) )&&
               ( (imagen[1].getY() >=120 && imagen[1].getY()<= 130) )){
                imagen[1].setVisible(false);
                etiqueta[1].setIcon(iconos[1]);
            }
        }
        if(e.getSource() == imagen[2]){
            System.out.println(imagen[2].getX()+","+imagen[2].getY());
            if(( (imagen[2].getX() >=129 && imagen[2].getX()<= 137) )&&
               ( (imagen[2].getY() >=189 && imagen[2].getY()<= 200) )){
                imagen[2].setVisible(false);
                etiqueta[2].setIcon(iconos[2]);
            }
        }
        if(e.getSource() == imagen[3]){
            System.out.println(imagen[3].getX()+","+imagen[3].getY());
            if(( (imagen[3].getX() >=229 && imagen[3].getX()<= 240) )&&
               ( (imagen[3].getY() >=189 && imagen[3].getY()<= 201) )){
                imagen[3].setVisible(false);
                etiqueta[3].setIcon(iconos[3]);
            }
        }
    }
}