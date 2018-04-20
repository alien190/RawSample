package com.example.ivanovnv.rawsample.model;

/**
 * Created by IvanovNV on 20.04.2018.
 */

public class GlossDef
{
    private String[] GlossSeeAlso;

    private String para;

    public String[] getGlossSeeAlso ()
    {
        return GlossSeeAlso;
    }

    public void setGlossSeeAlso (String[] GlossSeeAlso)
    {
        this.GlossSeeAlso = GlossSeeAlso;
    }

    public String getPara ()
    {
        return para;
    }

    public void setPara (String para)
    {
        this.para = para;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GlossSeeAlso = "+GlossSeeAlso+", para = "+para+"]";
    }
}