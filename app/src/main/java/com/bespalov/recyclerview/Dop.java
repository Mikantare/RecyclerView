package com.bespalov.recyclerview;

public class Dop {

    private int imageRec;
    private String name;
    private String description;

    public Dop(int imageRec, String name, String description) {
        this.imageRec = imageRec;
        this.name = name;
        this.description = description;
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
}
