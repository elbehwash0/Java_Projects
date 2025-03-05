
package GUI_Calculator_Project;

public class Circle extends GeometricObject {
private double radius;

public Circle(){}
public Circle(double r,String color,boolean filled){
this.radius=r;
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

@Override
    public double getArea(){
       return radius*radius*Math.PI;
    } 
@Override
    public double getPerimeter(){
    
    return 2*radius*Math.PI;
    }
    
}
