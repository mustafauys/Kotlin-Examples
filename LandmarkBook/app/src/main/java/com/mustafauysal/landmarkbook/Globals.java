package com.mustafauysal.landmarkbook;

import android.graphics.Bitmap;

public class Globals {
    private static Globals instance;

    private Bitmap chosenImage;

    private Globals(){

    }
    public void setData(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }

    public Bitmap getData() {
        return this.chosenImage;
    }

    public static Globals getInstance() {
        if (instance == null) {
            instance = new Globals();
        }
        return instance;
    }
}
