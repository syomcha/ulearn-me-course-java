package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int num = this.x;
        this.x = -this.y;
        this.y = -num;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(Math.abs(this.x - point.x), 2) + Math.pow(Math.abs(this.y - point.y), 2));
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}