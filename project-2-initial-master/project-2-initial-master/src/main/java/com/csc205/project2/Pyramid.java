package com.csc205.project2;

public class Pyramid extends Shape {
    private double height;
    private double width;

    Pyramid() {
        super();
        this.height = 0.0;
        this.width = 0.0;
    }

    Pyramid(double f, double g) {
        super();
        this.height = f;
        this.width = g;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double surfaceArea() {
        return (Math.pow(width, 2)) + (2 * width * (Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)))));
    }

    public double volume() {
        return (1.0/3.0) * (Math.pow(width, 2) * height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("height=").append(height);
        sb.append(", width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
