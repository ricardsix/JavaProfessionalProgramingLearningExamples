package com.company.geometricas;

public class Esfera extends Figura3D
{
    private double radio;

    public Esfera(long id, Circumferencia circumferencia)
    {
        super(id, circumferencia);
        this.radio = circumferencia.getRadio();
    }

    public double calculaAreaTotal()
    {
        return (Math.pow(radio,2) * Math.PI * 4.0);
    }
    public double calculaPerimetro()
    {
        return (2.0 * Math.PI * radio);
    }
    public double calculaVolumen()
    {
        return (4.0/3.0 * Math.PI * Math.pow(radio,3));
    }

    @Override
    public String toString()
    {
        return "Esfera{" +
                "id=" + id +
                ", arista=" + radio +
                "}";
    }
}