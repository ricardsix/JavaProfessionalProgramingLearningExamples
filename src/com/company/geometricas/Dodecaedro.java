package com.company.geometricas;

public class Dodecaedro extends Figura3D
{
    private double arista;
    private double ap;

    public Dodecaedro(long id, Pentagono pentagono)
    {
        super(id, pentagono);
        this.arista = pentagono.getLado();
        this.ap = pentagono.getAp();
    }

    public double calculaAreaTotal()
    {
        return (30.0*arista*ap);
    }
    public double calculaPerimetro()
    {
        return (30.0*arista);
    }
    public double calculaVolumen()
    {
        return (1.0/4.0*(15.0+(7*Math.sqrt(5)))*(Math.pow(arista,3)));
    }

    @Override
    public String toString()
    {
        return "Dodecaedro{" +
                "id=" + id +
                ", arista=" + arista +
                "}";
    }
}