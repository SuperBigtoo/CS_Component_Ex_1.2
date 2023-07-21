/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_2;

import java.util.Scanner;

/**
 *
 * @author Mini-SUPER-BIGTOO
 */
public class Foot {
 
    private FootShape footshape;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = sc.nextInt();
        
        Foot foot = new Foot();
        switch(type) {
            case 1:
                foot.draw("Ellipse");
                break;
            case 2:
                foot.draw("Rectangle");
                break;
        }
    }
    
    public void draw(String input) {
        footshape = new FootShape();
        switch(input) {
            case "Ellipse":
                footshape.drawAsEllipse();
                break;
            case "Rectangle":
                footshape.drawAsRectangle();
                break;
        }
    }
}
