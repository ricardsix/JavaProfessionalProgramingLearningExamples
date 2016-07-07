package com.company.geometricas;

public class Octaedro extends Figura3D
{
    private double arista;

    public Octaedro(long id, Triangulo triangulo)
    {
        super(id, triangulo);
        this.arista = triangulo.getBase();
    }

    public double calculaAreaTotal()
    {
        return ((Math.sqrt(3)*2.0)*(Math.pow(arista,2)));
    }
    public double calculaPerimetro()
    {
        return (12.0*arista);
    }
    public double calculaVolumen()
    {
        return ((Math.sqrt(2)/3.0)*(Math.pow(arista,3)));
    }

    @Override
    public String toString()
    {
        return "Octaedro{" +
                "id=" + id +
                ", arista=" + arista +
                "}";
    }
}