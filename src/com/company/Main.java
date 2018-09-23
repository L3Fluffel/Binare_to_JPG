package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static PixelString[] pixels = new PixelString[10];
    public static int number_of_pixelstrings = 0;
    public static int pixeldichte;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Width");
        JFrame.width = s.nextInt();
        System.out.println("Height");
        JFrame.height = s.nextInt();

        pixels[number_of_pixelstrings] = Create_PixelStrings();


        while(Pixel_ouf_of_Bounce(pixels) == false){
            try {
                pixels[number_of_pixelstrings] = Create_PixelStrings();
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.println("Zu viele Pixel!");
            }

        }





    }

    public static PixelString Create_PixelStrings(){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        PixelString p = new PixelString(0,Color.BLACK);

        if(input.charAt(0) == '0'){
            p.c = Color.WHITE;

        }
        else {
            p.c = Color.BLACK;
        }

        switch (input.substring(1)){
            case "000":
                p.length = 1;
                break;

            case "001":
                p.length = 2;
                break;

            case "010":
                p.length = 3;
                break;

            case "011":
                p.length = 4;
                break;

            case "100":
                p.length = 5;
                break;

            case "101":
                p.length = 6;
                break;

            case "110":
                p.length = 7;
                break;

            case "111":
                p.length = 8;
                break;

        }

        p.length = p.length ;
        number_of_pixelstrings += 1;
        return p;



    }

    public static boolean Pixel_ouf_of_Bounce(PixelString[] p){
        int a = 0;

        for(int i= 0;i<number_of_pixelstrings;i++){
            a += p[i].length;
        }

        if(a == JFrame.height*JFrame.width){
            JFrame m = new JFrame();
            m.repaint();
            System.out.println("Pixel Completed");
            System.out.println("Pixeldichte: "+(((JFrame.width*JFrame.height)*100)/(((number_of_pixelstrings)*4))*100)/100);

            return true;
        }

        if(a<JFrame.height*JFrame.width){
            return false;
        }

        else{
            return true;
        }


    }

}
