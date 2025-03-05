
package GUI_Calculator_Project;


public class Rectangle extends GeometricObject {
   private double width;
   private double height;
    public Rectangle(){}
    public Rectangle(double height,double width)
    {
        this.height=height;
        this.width=width;
    }
     public Rectangle(double height,double width,String color,boolean filled )
    {
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
   
    @Override
    public double getArea(){
    
    return width*height;
    }
    
   @Override
    public double getPerimeter(){
    
    return 2*(width+height);
    }
}

