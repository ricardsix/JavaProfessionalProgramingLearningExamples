package com.company.geometricas;

public class Cuadrado extends Figura2D
{
    private double lado;

    public Cuadrado(double lado, long id, String color)
    {
        super(id, color);
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }

    public double calculaArea()
    {
        return (Math.pow(lado,2));
    }
    public double calculaPerimetro()
    {
        return (4*lado);
    }

    @Override
    public String toString()
    {
        return "Cuadrado{" +
                "id=" + id +
                ", lado=" + lado +
                "}";
    }
}