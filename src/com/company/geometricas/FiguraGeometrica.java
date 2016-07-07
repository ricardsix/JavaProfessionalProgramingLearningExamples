package com.company.geometricas;

import java.util.ArrayList;

public abstract class FiguraGeometrica {
    protected long id;
    private String color;

    public  FiguraGeometrica(long id, String color)
    {
        this.id = id;
        this.color = color;
    }

    public FiguraGeometrica(long id)
    {
        this.id = id;
        this.color = "blue";
    }

    public long getId()
    {
        return id;
    }
}
