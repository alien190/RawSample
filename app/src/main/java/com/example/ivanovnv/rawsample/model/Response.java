package com.example.ivanovnv.rawsample.model;

/**
 * Created by IvanovNV on 20.04.2018.
 */

public class Response
{
    private Glossary glossary;

    public Glossary getGlossary ()
    {
        return glossary;
    }

    public void setGlossary (Glossary glossary)
    {
        this.glossary = glossary;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [glossary = "+glossary+"]";
    }
}