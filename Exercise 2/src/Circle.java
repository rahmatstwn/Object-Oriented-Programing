public class Circle {
    double radius = 1.0;
    public Circle (double radius){
        this.radius = radius;
    }
    double GetRadius(){
        return radius;
    }
    public void SetRadius(double radius){
        this.radius = radius;
    }
    double GetArea(){
        return Math.PI*radius*radius;
    }
    double GetCircumference(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle[radius = "+this.radius+" ] is area : "+this.GetArea() + "\n" +
        "Circle[radius = "+this.radius+" ] is circumference : "+this.GetCircumference();
    }

    public static void main(String[] args) {
        Circle baru = new Circle (2);
        System.out.println("The Radius is: "+baru.radius);
        System.out.println(baru.toString());
        baru.SetRadius(10);
        System.out.println("Change Radius : "+baru.radius);
        System.out.println(baru.toString());
    }
}
