package com.company.geometricas;

public class Cubo extends Figura3D
{
    private double arista;

    public Cubo(long id, Cuadrado cuadrado)
    {
        super(id, cuadrado);
        this.arista = cuadrado.getLado();
    }

    public double calculaAreaTotal()
    {
        return (Math.pow(arista,2)*6.0);
    }
    public double calculaPerimetro()
    {
        return (12.0*arista);
    }
    public double calculaVolumen()
    {
        return (Math.pow(arista,3));
    }
    public double calculaDiagonal()
    {
        return (Math.sqrt(3)*arista);
    }

    @Override
    public String toString()
    {
        return "Cubo{" +
                "id=" + id +
                ", arista=" + arista +
                "}";
    }
}