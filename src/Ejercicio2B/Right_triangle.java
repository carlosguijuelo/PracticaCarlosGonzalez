/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2B;

/**
 *
 * @author Carlos Guijuelo
 */
public class Right_triangle extends Shape {
    public Right_triangle(double size) {
        super(size);
    }
    public double area() {
        double size = getSize() ;
        return size*size/2;
    }
}
