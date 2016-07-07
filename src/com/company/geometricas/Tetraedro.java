package com.company.geometricas;

public class Tetraedro extends Figura3D
{
    private double arista;

    public Tetraedro(long id, Triangulo triangulo)
    {
        super(id, triangulo);
        this.arista = triangulo.getBase();
    }
    public double calculaAreaTotal()
    {
        return (Math.pow(arista,2)*6.0);
    }
    public double calculaPerimetro()
    {
        return (6.0*arista);
    }
    public double calculaVolumen()
    {
        return ((Math.sqrt(2)/12)*arista);
    }

    @Override
    public String toString()
    {
        return "Tetraedro{" +
                "id=" + id +
                ", arista=" + arista +
                "}";
    }
}