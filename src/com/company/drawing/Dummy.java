package com.company.drawing;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.*;

public class Dummy extends JPanel
{
    float []dash={6f,2.0f,6.0f};
    BasicStroke EjeX= new BasicStroke(5.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,1.0f,dash,0.0f);
    int num = 200;
    PolygonObject PolyT;
    PolygonObject PolyC;
    PolygonObject PolyR;
    PolygonObject PolyP;
    // String PolyO;

    public static void main(String[] args) {
        Dummy dummy=new Dummy();
    }
    public Dummy()
    {

        //EjeX = new.Float(100, 100, 250, 260);
        PolyT = new PolygonObject(new int[]{num+10, num+200, num+10}, new int[]{10, 100, 200}, Color.black);
        PolyC = new PolygonObject(new int[]{2*num+10, 2*num+200, 2*num+200, 2*num+10}, new int[]{10, 10, 200, 200}, Color.black);
        PolyR = new PolygonObject(new int[]{3*num+10, 3*num+100, 3*num+100, 3*num+10}, new int[]{10, 10, 200, 200}, Color.black);
        PolyP = new PolygonObject(new int[]{4*num+10, 4*num+85, 4*num+160, 4*num+135, 4*num+35}, new int[]{80, 20, 80, 165, 165}, Color.black);
        //PolyO = ;

    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(EjeX);

        PolyT.drawPolygon(g); //Imprime un triangulo
        PolyC.drawPolygon(g); //Imprime un cuadrado
        PolyR.drawPolygon(g); //Imprime un rectangulo
        PolyP.drawPolygon(g); //Imprime un pentagono
        g.drawOval(0,0,200,200); //Imprime un ovalo
    }
}