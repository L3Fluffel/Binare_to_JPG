package com.company;

import javax.swing.*;
import java.awt.*;

public class JFrame extends javax.swing.JFrame {

    public static int width;
    public static int height;

    public JFrame(){

        super("JPG");
        setSize(200,200);
        setVisible(true);
        setResizable(false);
        add(new JPane());


    }
}
class JPane extends JPanel{

    int x = 0;
    int line = 0;

    @Override
    public void paint(Graphics g){



        for(int i = 0;i<Main.number_of_pixelstrings;i++){

            g.setColor(Main.pixels[i].c);

            if(x+Main.pixels[i].length < JFrame.width){

                g.fillRect(x*10,line,Main.pixels[i].length*10,10);
                x += Main.pixels[i].length;
            }
            if(x+Main.pixels[i].length >= JFrame.width){
                g.fillRect(x*10,line,(JFrame.width-x)*10,10);

                Main.pixels[i].length -= JFrame.width-x;
                x = 0;
                line += 10;

                g.fillRect(x*10,line,Main.pixels[i].length*10,10);
                x+= Main.pixels[i].length;
            }


        }

        g.setColor(Color.blue);
        g.drawRect(0,0,JFrame.width*10,JFrame.height*10);


    }

}
