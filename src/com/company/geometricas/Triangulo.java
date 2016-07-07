package com.company.geometricas;

public class Triangulo extends Figura2D
{
    private double base; //private hace que no se pueda acceder externamente
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura, double lado1, double lado2, long id, String color)
    {
        super(id, color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getBase() {
        return base;
    }
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double calculaArea()
    {
        return ((base*altura)/2.0);
    }
    public double calculaPerimetro()
    {
        return (base+lado1+lado2);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "id=" + id +
                ", base=" + base +
                ", altura=" + altura +
                ", lado1=" + lado1+
                ", lado2=" + lado2+
                "}";
    }
}
