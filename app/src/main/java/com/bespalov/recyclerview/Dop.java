package com.bespalov.recyclerview;

public class Dop {

    private int imageRec;
    private String name;
    private String description;
    private String Info;


    public Dop(int imageRec, String name, String description, String info) {
        this.imageRec = imageRec;
        this.name = name;
        this.description = description;
        Info = info;
    }

    public int getImageRec() {
        return imageRec;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getInfo() {
        return Info;
    }
}

