package com.example.ivanovnv.rawsample.model;

/**
 * Created by IvanovNV on 20.04.2018.
 */

public class GlossEntry
{
    private String SortAs;

    private GlossDef GlossDef;

    private String GlossSee;

    private String GlossTerm;

    private String ID;

    private String Acronym;

    private String Abbrev;

    public String getSortAs ()
    {
        return SortAs;
    }

    public void setSortAs (String SortAs)
    {
        this.SortAs = SortAs;
    }

    public GlossDef getGlossDef ()
    {
        return GlossDef;
    }

    public void setGlossDef (GlossDef GlossDef)
    {
        this.GlossDef = GlossDef;
    }

    public String getGlossSee ()
    {
        return GlossSee;
    }

    public void setGlossSee (String GlossSee)
    {
        this.GlossSee = GlossSee;
    }

    public String getGlossTerm ()
    {
        return GlossTerm;
    }

    public void setGlossTerm (String GlossTerm)
    {
        this.GlossTerm = GlossTerm;
    }

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
    }

    public String getAcronym ()
    {
        return Acronym;
    }

    public void setAcronym (String Acronym)
    {
        this.Acronym = Acronym;
    }

    public String getAbbrev ()
    {
        return Abbrev;
    }

    public void setAbbrev (String Abbrev)
    {
        this.Abbrev = Abbrev;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SortAs = "+SortAs+", GlossDef = "+GlossDef+", GlossSee = "+GlossSee+", GlossTerm = "+GlossTerm+", ID = "+ID+", Acronym = "+Acronym+", Abbrev = "+Abbrev+"]";
    }
}
