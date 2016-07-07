package com.company.drawing;
import javafx.beans.value.ObservableValue;

import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;

public class PolygonObject
{
    Object O;
    Polygon P;
    Color c;

    public PolygonObject(int[]x, int[]y, Color c)
    {
        P = new Polygon();
        O = new Object();
        P.xpoints = x;
        P.ypoints = y;
        P.npoints = x.length;
        this.c = c;
    }

    void drawPolygon(Graphics g)
    {
        g.setColor(c);
        g.drawPolygon(P);
    }

    public void drawOval(Graphics g)
    {
        g.setColor(c);
        //g.drawOval();
    }
}
