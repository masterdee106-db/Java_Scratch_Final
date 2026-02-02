package Java_Practice.SOLID_Principle.LiskovSubstitutionPrinciple;

class Rectangle{
    protected double width;
    protected  double height;

    public Rectangle(double w, double h){
        width=w;
        height=h;
    }

    public double area(){
        return width*height;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        width=w;
    }

    public double getHeigh(){
        return  height;
    }
    public void setHeight(double h){
        height=h;
    }
}

class Square extends Rectangle{
    public Square(double size){
        super(size,size);
    }

    @Override
    public void setWidth(double w){
        width=height=w;
    }
    @Override
    public void setHeight(double h){
        width=height=h;
    }
}
public class LiskovPrinciple {
    public static void main(String[] args) {

        Square  square= new Square(5);
        square.setWidth(10);
        System.out.println("Area: "+ square.area());
    }
}
