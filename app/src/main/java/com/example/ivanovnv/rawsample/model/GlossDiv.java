package com.example.ivanovnv.rawsample.model;

/**
 * Created by IvanovNV on 20.04.2018.
 */

public class GlossDiv
{
    private GlossList GlossList;

    private String title;

    public GlossList getGlossList ()
    {
        return GlossList;
    }

    public void setGlossList (GlossList GlossList)
    {
        this.GlossList = GlossList;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GlossList = "+GlossList+", title = "+title+"]";
    }
}
