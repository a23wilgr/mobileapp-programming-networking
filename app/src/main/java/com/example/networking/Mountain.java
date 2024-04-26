package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String id;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private Auxdata auxdata;

    public String getName() {return name;}

    public Auxdata getAuxdata() {
        return auxdata;
    }

    @Override
    public String toString(){
        return name;
    }
}