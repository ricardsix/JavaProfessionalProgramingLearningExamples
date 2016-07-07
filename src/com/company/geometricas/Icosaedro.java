package com.company.geometricas;

public class Icosaedro extends Figura3D
{
    private double arista;

    public Icosaedro(long id, Triangulo triangulo)
    {
        super(id, triangulo);
        this.arista = triangulo.getBase();
    }

    public double calculaAreaTotal()
    {
        return ((Math.sqrt(3)*5.0)*(Math.pow(arista,2)));
    }
    public double calculaPerimetro()
    {
        return (30*arista);
    }
    public double calculaVolumen()
    {
        return (5.0/12.0*(Math.sqrt(5)+3.0)*(Math.pow(arista,3)));
    }

    @Override
    public String toString()
    {
        return "Icosaedro{" +
                "id=" + id +
                ", arista=" + arista +
                "}";
    }
}