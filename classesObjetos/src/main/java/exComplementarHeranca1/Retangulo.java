package exComplementarHeranca1;

public class Retangulo {
    private double length = 1;
    private double width = 1;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length > 0.0 && length < 20.0){
            this.length = length;
        }
        else{
            this.length = 1.0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0.0 && width < 20.0){
            this.width = width;
        }
        else{
            this.width = 1.0;
        }
    }
    
    public double area(){
        double a = this.length * this.width;
        return a;
    }
    
    public double perimetro(){
        double p = (this.length * 2) + (this.width*2);
        return p;
    }
    
    
}