package com.company.geometricas;

public class Circumferencia extends Figura2D
{
    private double radio;

    public Circumferencia(double radio, long id, String color)
    {
        super(id, color);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public double calculaArea()
    {
        return (Math.PI * (Math.pow(radio, 2)));
    }
    public double calculaPerimetro()
    {
        return (2 * Math.PI * radio);
    }
    public double calculaDiametro()
    {
        return radio*2;
    }
    @Override
    public String toString()
    {
        return "Circumferencia{" +
                "id=" + id +
                ", radio=" + radio +
                '}';
    }
}