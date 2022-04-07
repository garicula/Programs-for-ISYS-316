package com.alpha;

import java.lang.*;

public class MorleyGarrickAssignment1{
    public static void main(String[] args) {
        circle.Circle circle = new circle.Circle(1, 1, 1.0);
        circle.setColor("green");
        circle.setFilled(false);
        System.out.println("The center and radius of the circle is: " + circle.getCenterX() + ", "
                + circle.getCenterY() + " - " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The perimeter is "
                + circle.getPerimeter());
        System.out.println("The length of the diameter is "
                + circle.getDiameterLength());
        System.out.println(circle);
    }
}

class GeometricObject {

}

class circle extends GeometricObject {


    // Circle class starts here
    public static class Circle {

        double dRadius = 1.0;
        int iCenterX = 1;
        int iCenterY = 1;

        // Constructor with no arguments
        public Circle() {

            this.iCenterX=1;
            this.iCenterY=1;
            this.dRadius=1.0;

        }

        // Circle class constructors below

        // Constructor with arguments
        public Circle(double iCenterX,double iCenterY,double dRadius)
        {
            this.iCenterX = (int) iCenterX;
            this.iCenterY = (int) iCenterY;
            this.dRadius = dRadius;
        }

        // The accessor (get) method for all data fields

        // Return the value of iCenterX
        public int getiCenterX()
        {
            return iCenterX;
        }

        // Return the value of iCenterY
        public int getiCenterY()
        {
            return iCenterY;
        }

        // Return the value of dRadius
        public double getdRadius()
        {
            return dRadius;
        }

        // END GET METHODS, start acquiring data on the circle

        // Get the area of the circle
        public double getArea()
        {
            return (dRadius * dRadius) * 3.14;
        }

        // Get the perimeter of the circle
        public double getPerimeter()
        {
            return dRadius * 3.14 * 2;
        }

        public double getDiameterLength()
        {
            return dRadius * 2;
        }

        public double circle; void setColor(String green)
        {

        }

        public String stats = new String("This circle has an area of " + getArea() + " and a perimeter of "
                + getPerimeter() + " and a diameter of " + getDiameterLength() + " and those are the descriptions");

        public void setFilled( boolean b)
        {
            return;
        }

        public Object getCenterX()
        {
            return 1;
        }

        public Object getCenterY()
        {

            return 1;
        }

        public Object getRadius()
        {
            return 1.0;
        }

        // Circle class ending


    }
}

