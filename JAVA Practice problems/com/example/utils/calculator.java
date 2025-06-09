package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Recatangle;

public class calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.2);
        Recatangle rec = new Recatangle(5,2);

        double cirArea = Math.PI * Math.pow(cir.radius,2);
        int recArea = rec.length * rec.breadth;
        System.out.printf(" The area of circle is : %f, The area of rectangle is : %s", cirArea,recArea);
    }
}
