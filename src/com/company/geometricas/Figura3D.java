package com.company.geometricas;

public abstract class Figura3D extends FiguraGeometrica
{
    Figura2D figura2D;

    public Figura3D(long id, Figura2D figura2D)
    {
        super(id);
        this.figura2D = figura2D;
    }
    public abstract double calculaPerimetro();
    public abstract double calculaAreaTotal();
    public abstract double calculaVolumen();
}
