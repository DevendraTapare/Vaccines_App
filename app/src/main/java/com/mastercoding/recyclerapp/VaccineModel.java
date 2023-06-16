package com.mastercoding.recyclerapp;

public class VaccineModel {

    private String title;
    private int image;

    public VaccineModel(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
