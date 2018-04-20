package com.example.ivanovnv.rawsample.model;

/**
 * Created by IvanovNV on 20.04.2018.
 */

public class GlossList
{
    private GlossEntry GlossEntry;

    public GlossEntry getGlossEntry ()
    {
        return GlossEntry;
    }

    public void setGlossEntry (GlossEntry GlossEntry)
    {
        this.GlossEntry = GlossEntry;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GlossEntry = "+GlossEntry+"]";
    }
}