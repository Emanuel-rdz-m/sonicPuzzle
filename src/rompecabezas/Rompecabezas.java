package rompecabezas;
import javax.swing.JFrame;

public class Rompecabezas {
    public static void main(String[] args) {
        RompecabezasSonic m1 = new RompecabezasSonic();
        m1.setVisible(true);
        m1.setSize(480,350);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m1.setLocationRelativeTo(null);
    }
    
}
