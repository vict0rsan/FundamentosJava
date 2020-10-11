package clases;

public class Circle {

    double r = 1;

    public Circle(double r) {
        this.r = r;
    }
    
    public double getRadius(){
        return r;
    }
    public double getArea(){
        return Math.PI*Math.pow(r, 2);
    }

}
