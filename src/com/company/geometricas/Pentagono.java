package com.company.geometricas;

public class Pentagono extends Figura2D
{
    private double lado;
    private double ap = 0;

    public Pentagono(double lado, long id, String color)
    {
        super(id, color);
        this.lado = lado;
    }
    public double getAp()
    {
        return ap;
    }
    public double getLado() {
        return lado;
    }
    public double calculaArea()
    {
        ap = lado/1.45;
        return ((5.0*lado*ap)/2.0);
    }
    public double calculaPerimetro()
    {
        return (5.0*lado);
    }

    @Override
    public String toString()
    {
        return "Pentagono{" +
                "id=" + id +
                ", lado=" + lado +
                "}";
    }
}