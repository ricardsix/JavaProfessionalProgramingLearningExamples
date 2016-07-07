package com.company.geometricas;

public abstract class Figura2D extends FiguraGeometrica
{
    public Figura2D(long id, String color)
    {
    super(id, color);
    }
    public abstract double calculaArea();
    public abstract double calculaPerimetro();
}
