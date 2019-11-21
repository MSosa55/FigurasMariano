package figuras;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Circulo extends FiguraGeometrica{
    private static int radio;
    private static JFrame frame;
    
    public Circulo (int pRadio){
        super();
        radio = pRadio;
    }
    public static int getRadio(){
        return radio;
    }
    
    public static void setRadio(int pradio){
        radio = pradio;
    }
    
    @Override
    public float Area(){
        return (float)(Math.PI*Math.pow(radio, 2));
    }
    
    @Override
    public float Perimetro(){
        return (float)(2 * Math.PI * radio);    
    }
    
    @Override
    public void drawFigure(Graphics g){
        g.drawOval((int)(155-(radio / 2)), (int)(110-(radio/2)), radio, radio);
    }
}
