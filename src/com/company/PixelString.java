package com.company;

import java.awt.*;

public class PixelString {


    int length;



    Color c;

    public PixelString(int length,Color c){

        this.length = length;
        this.c = c;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
}
