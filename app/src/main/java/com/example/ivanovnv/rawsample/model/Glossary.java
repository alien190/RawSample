package com.example.ivanovnv.rawsample.model;

/**
 * Created by IvanovNV on 20.04.2018.
 */

public class Glossary
{
    private String title;

    private GlossDiv GlossDiv;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public GlossDiv getGlossDiv ()
    {
        return GlossDiv;
    }

    public void setGlossDiv (GlossDiv GlossDiv)
    {
        this.GlossDiv = GlossDiv;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", GlossDiv = "+GlossDiv+"]";
    }
}


