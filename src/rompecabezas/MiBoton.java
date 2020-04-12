package rompecabezas;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;

public class MiBoton extends JButton{
    public MiBoton(String text){
        setText(text);
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent evento){
                setLocation(
                    getX() + evento.getX() - getWidth() /2,
                    getY() + evento.getY() - getHeight() /2
                );
            }   
        });
    }
}
